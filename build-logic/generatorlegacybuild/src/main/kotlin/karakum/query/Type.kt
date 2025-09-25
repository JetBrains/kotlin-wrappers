package karakum.query

import karakum.common.JsUnionConverter.sealedUnionBody

private val SPECIAL_TYPES = setOf(
    "boolean | number | ShouldRetryFunction<TError>",
    "number | RetryDelayFunction<TError>",
)

private val SKIPPED_TYPES = setOf(
    "Override",
    "NoInfer",
    "NonFunctionGuard",
    "NonUndefinedGuard",
    "SkipToken",
    "OmitKeyof",
    "DistributiveOmit",
    "ReplaceReturnType",
    "DataTag",
    "AnyDataTag",
    "InferDataFromTag",
    "InferErrorFromTag",
)

class Type(
    override val source: String,
    fixAction: Boolean,
) : Declaration() {
    private val originalTypeParameters: List<String> by lazy {
        if ("> = " !in source) {
            return@lazy emptyList<String>()
        }

        parseTypeParameters(source.substringBefore("> = ") + ">")
    }

    private val typeParameters: List<String> by lazy {
        originalTypeParameters.map { it.substringBefore(": ") }
    }

    override val name: String =
        getTypeName(source, JsTypeKeyword.TYPE, fixAction)

    val enumMode: Boolean by lazy {
        " = '" in source
    }

    private val originalBody: String by lazy {
        val result = source
            .substringAfterLast(" = ")
            .removeSuffix(";")
            .replace(": Array<", ": ReadonlyArray<")
            .replace(" | undefined | null", "?")
            .replace(" | undefined", "?")

        if (result.startsWith("Override<")) {
            result.removePrefix("Override<")
                .substringBefore(", {")
        } else result
    }

    private val body: String by lazy {
        val body = originalBody
            .replace(" => T | Promise<T>", " => PromiseResult<T>")
            .replace("QueryFunctionContext<TQueryKey>", "QueryFunctionContext<TQueryKey, *>")
            .replace(": ReadonlyArray<QueryObserverResult>", ": ReadonlyArray<QueryObserverResult<*, *>>")
            .replace(": undefined", ": Void")
            .replace(" => React.ReactNode", " => react.ReactNode")

        when {
            body in SPECIAL_TYPES -> body.substringAfterLast(" | ")

            body.toIntOrNull() != null -> body

            name == QUERY_KEY -> body

            name == "UseErrorBoundary" -> body
                .removeSurrounding("boolean | (", ")")
                .replace(" => boolean", " -> Boolean")

            body.startsWith("boolean | ")
                    || body.startsWith("number | ")
                    || body.startsWith("TOutput | ")
                    || body.startsWith("StaleTime | ")
                -> body.substringAfter(" | ")
                .removeSurrounding("(", ")")
                .replace(" => boolean", " -> Boolean")
                .replace(" => number", " -> Number")
                .replace(" => ", " -> ") +
                    " /* | ${body.substringBefore(" | ")} */"

            body.startsWith("Omit<") -> body.removePrefix("Omit<").substringBefore(", '")
            body.startsWith("OmitKeyof<") -> body.removePrefix("OmitKeyof<").substringBefore(", '")
            body.startsWith("DistributiveOmit<") -> body.removePrefix("DistributiveOmit<").substringBefore(", '")
            name.endsWith("Result") -> body

            "|" in body -> "Union /* $body */"

            body == "Record<string, unknown>" -> "Record<String, *>"
            body.startsWith("MutateFunction<") -> body

            body == "(data: any) => any" -> "(data: Any?) -> Any?"
            body == "(...args: any[]) => void" -> "Function<Unit>"

            body.startsWith("(") && "..." in body -> "Function<Unit> /* $body */"

            body.startsWith("(") -> {
                kotlinFunctionType(body)
                    .replace("QueryObserverResult[]", "ReadonlyArray<QueryObserverResult<*, *>>")
                    .replace("TQueryFnData[]", "ReadonlyArray<TQueryFnData>")

                    .replace("mutation: Mutation", "mutation: Mutation<*, *, *, *>")
                    .replace("mutation?: Mutation", "mutation: Mutation<*, *, *, *>?")
                    .replace("event?: QueryCacheNotifyEvent", "event: QueryCacheNotifyEvent?")
                    .replace(
                        "options?: MutateOptions<TData, TError, TVariables, TOnMutateResult>",
                        "options: MutateOptions<TData, TError, TVariables, TOnMutateResult>?"
                    )
            }

            else -> "Any"
        }
    }

    override fun toCode(): String {
        val isUnusedType = name.startsWith("AnyUse") && name.endsWith("Options")
        if (name in SKIPPED_TYPES || isUnusedType)
            return ""

        if (name == "QueryClientProviderProps")
            return """
                external interface QueryClientProviderProps: react.PropsWithChildren {
                    var client: QueryClient
                }
            """.trimIndent()

        if (name == "StaleTime") {
            require(originalBody == "number | 'static'") {
                "Actual original body - $originalBody"
            }

            return sealedUnionBody(
                name = name,
                values = listOf("static"),
            ) + "\n\n" + """
            inline fun $name(
                value: JsDuration,
            ): $name =
                unsafeCast(value)
            """.trimIndent()
        }

        if (originalBody.startsWith("'")) {
            val values = originalBody.splitToSequence(" | ")
                .map { it.removePrefix("'") }
                .map { it.removeSuffix("'") }
                .toList()

            return sealedUnionBody(
                name = name,
                values = values,
            )
        }

        val declaration = "$name${formatParameters(typeParameters)}"
        if (!name.startsWith("UseSuspense") && name.endsWith("Result") && " | " in source) {
            val parentDeclaration = declaration
                .removePrefix("Defined")
                .replace("Result<", "BaseResult<")

            return """
            @JsPlainObject
            external interface $declaration:
                $parentDeclaration
            """.trimIndent()
        }

        if (body.toIntOrNull() != null)
            return "const val $name = $body"

        if (name == QUERY_KEY)
            return """
                // ReadonlyArray<unknown>
                external interface $name
                """.trimIndent()

        if (name == "UseBaseMutationResult") {
            return """
            @JsPlainObject
            external interface $name${formatParameters(typeParameters)} : $body {
                // override val mutate: UseMutateFunction<TData, TError, TVariables, TOnMutateResult>
                val mutateAsync: UseMutateAsyncFunction<TData, TError, TVariables, TOnMutateResult>
            }
            """.trimIndent()
        }

        if (name == "QueryFunction") {
            val interfaceTypeParameters = formatParameters(originalTypeParameters.map { "out $it" })
            val adapterTypeParameters = formatParameters(originalTypeParameters)
            val simpleTypeParameters = formatParameters(typeParameters)
            val adapterType = name + simpleTypeParameters
            return """
            @JsExternalInheritorsOnly
            sealed external interface ${name}OrSkipToken$interfaceTypeParameters

            sealed external interface $name$interfaceTypeParameters :
                ${name}OrSkipToken$simpleTypeParameters

            inline fun $adapterTypeParameters $name(
                noinline value: $body,
            ): $adapterType =
                unsafeCast(value)
            """.trimIndent()
        }

        return "typealias $name${formatParameters(typeParameters)} = $body"
    }
}
