package karakum.query

private const val PROMISE = "Promise"

private val CLASS_REGEX = Regex("""[\w\d]+""")

private val STANDARD_TYPE_MAP = mapOf(
    "any" to "Any",
    "object" to "Any",

    "boolean" to "Boolean",
    "string" to "String",

    "void" to "Unit",

    "Date" to "js.date.Date",

    "null" to "Void",
    "undefined" to "Void",
    "never" to "Void",

    "true" to "True",
    "false" to "False",

    "unknown | undefined" to "Any?",
    "boolean | T | undefined" to "T?",

    "TData | Promise<TData>" to "PromiseResult<TData>",
    "() => unknown | Promise<unknown>" to "() -> Promise<*>?",
    "Promise<unknown>" to "Promise<*>",
    "Promise<void>" to "Promise<Void>",

    "Set<TListener>" to "JsSet<TListener>",

    "InfiniteData<unknown>" to "InfiniteData<*, *>",

    "Mutation" to "Mutation<*, *, *, *>",
    "Mutation<any, any>" to "Mutation<*, *, *, *>",
    "MutationState" to "MutationState<*, *, *, *>",
    "MutationObserver<any, any, any>" to "MutationObserver<*, *, *, *>",
    "MutationObserver<any, any, any, any>" to "MutationObserver<*, *, *, *>",

    "QueryObserverOptions<any, any, any, any, any>" to "QueryObserverOptions<*, *, *, *, *, *>",
    "QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>" to "QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey, *>",

    "FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey>" to "FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey, *>",
    "FetchOptions" to "FetchOptions<*>",

    "Query" to "Query<*, *, *, *>",
    "QueryFilters" to "QueryFilters<*>",
    "MutationFilters" to "MutationFilters<*, *, *, *>",
    "IterableIterator<Query>" to "JsIterator<Query<*, *, *, *>>",

    "QueryState" to "QueryState<*, *>",
    "QueryOptions<any, any>" to "QueryOptions<*, *, *, *, *>",
    "QueryOptions<any, any, any, any>" to "QueryOptions<*, *, *, *, *>",
    "QueryFunction<TQueryFnData, TQueryKey>" to "QueryFunction<TQueryFnData, TQueryKey, *>",
    "QueryObserverOptions" to "QueryObserverOptions<*, *, *, *, *, *>",
    "QueryObserverOptions<TQueryFnData, TError, TData, TQueryData>" to "QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, *, *>",
    "QueryObserverResult" to "QueryObserverResult<*, *>",
    "UseQueryOptions[]" to "ReadonlyArray<UseQueryOptions<*, *, *, *>>",
    "UseQueryResult[]" to "ReadonlyArray<UseQueryResult<*, *>>",
    "RefetchOptions & RefetchQueryFilters<TPageData>" to "RefetchOptions /* & RefetchQueryFilters<TPageData> */",

    "QueriesResults<T>" to "QueriesResults<T,*,*>",
    "QueryTypeFilter | 'none'" to "QueryTypeFilter /* | 'none' */",

    "QueryBehavior<TQueryFnData, TError, InfiniteData<TData, TPageParam>>" to "QueryBehavior<TQueryFnData, TError, InfiniteData<TData, TPageParam>, *>",
    "QueryPersister<NoInfer<TQueryFnData>, NoInfer<TQueryKey>, NoInfer<TPageParam>>" to "QueryPersister<TQueryFnData, TQueryKey, TPageParam>",

    "QueryFunction<TQueryFnData, TQueryKey, TPageParam> | SkipToken" to "QueryFunctionOrSkipToken<TQueryFnData, TQueryKey, TPageParam>",
    "EnsureQueryDataOptions<TQueryFnData, TError, TData, TQueryKey>" to "EnsureQueryDataOptions<TQueryFnData, TError, TData, TQueryKey, *>",

    "InvalidateQueryFilters<TPageData>" to "InvalidateQueryFilters<TPageData>",
    "RefetchQueryFilters<TPageData>" to "RefetchQueryFilters<TPageData>",
    "ResetQueryFilters<TPageData>" to "ResetQueryFilters<TPageData>",

    "typeof QueryObserver" to "JsClass<QueryObserver<*, *, *, *, *>>",
    "TData | InitialDataFunction<TData>" to "InitialDataFunction<TData> /* | TData */",
    "TQueryData | PlaceholderDataFunction<TQueryData>" to "PlaceholderDataFunction<TQueryData> /* | TQueryData */",
    "boolean | ((oldData: TData | undefined, newData: TData) => TData)" to
            "(oldData: TData?, newData: TData) -> TData /* | boolean */",
    "boolean | 'always' | ((query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) => boolean | 'always')" to
            "(query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) -> Boolean /* | boolean | 'always' */",
    "number | false | ((data: TData | undefined, query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) => number | false)" to
            "(data: TData?, query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) -> JsDuration /* | number | false */",

    "Parameters<T>" to "ReadonlyArray<*> /* Parameters<T> */",

    "((value: QueryErrorResetBoundaryValue) => React.ReactNode) | React.ReactNode" to
            "(value: QueryErrorResetBoundaryValue) -> react.ReactNode",

    "boolean | ((error: TError) => boolean)" to "(error: TError) -> Boolean",

    "({ children, }: QueryErrorResetBoundaryProps) => react_jsx_runtime.JSX.Element" to
            "react.FC<QueryErrorResetBoundaryProps>",
    "({ client, children, }: QueryClientProviderProps) => React.JSX.Element" to
            "react.FC<QueryClientProviderProps>",
    "({ children, options, state, queryClient, }: HydrationBoundaryProps) => React.ReactElement" to
            "react.FC<HydrationBoundaryProps>",

    "import(\"./query\").Query<unknown, unknown, unknown, QueryKey>" to
            "Query<*, *, *, QueryKey>",

    "keyof QueryObserverResult" to "String /* keyof QueryObserverResult */",

    "HydrateOptions['defaultOptions']" to "DefaultHydrateOptions",

    "QueryErrorResetBoundaryFunction | React.ReactNode" to "QueryErrorResetBoundaryFunction",

    "UseQueryResult<NoInfer<TData>, TError>" to "UseQueryResult<TData, TError>",
)

private val SAFE_PREFIXES = setOf(
    "Action",
    "Ensured",
    "Get",
    "Fetch",
    "Infinite",
    "Mutate",
    "Mutation",
    "Query",
    "Retry",
    "Updater",
    "Use",
)

internal fun kotlinType(
    type: String,
    name: String? = null,
): String {
    if ("""import("./types").""" in type)
        return kotlinType(type.replace("""import("./types").""", ""), name)

    if (type.startsWith("import(\"@tanstack/query-core\")."))
        return kotlinType(type.removePrefix("import(\"@tanstack/query-core\")."), name)

    // TEMP
    if (type.startsWith("useQueries<T extends"))
        return "QueriesResults<T, *, *>"

    if (STANDARD_TYPE_MAP.containsKey(type))
        return STANDARD_TYPE_MAP.getValue(type)

    if (type == HYDRATION_BOUNDARY_OPTIONS)
        return "HydrateOptions /* $HYDRATION_BOUNDARY_OPTIONS */"

    if (type == "number")
        return when {
            name == null -> "Int"
            name.endsWith("At") -> "EpochTimeStamp"
            name.endsWith("Time") -> "JsDuration"
            name == "timeout" -> "JsDuration"

            else -> "Int"
        }

    if (type.startsWith("'")) {
        return when (name) {
            "type" -> "Type /* $type */"
            "status" -> "QueryStatus /* $type */"
            "_optimisticResults" -> "String /* $type */"
            else -> TODO("Name - $name, Type - $type")
        }
    }

    if (type == "unknown") {
        return when (name) {
            "pages",
                -> "Page"

            "pageParam",
            "pageParams",
                -> "PageParam"

            else -> "Any?"
        }
    }

    if (type.startsWith("Partial")) {
        val baseType = kotlinType(type.removeSurrounding("Partial<", ">"))
        return "$baseType /* Partial */"
    }

    if (" is " in type)
        return "Boolean /* $type */"

    if (type.isClassLike())
        return type

    if (type.startsWith("React."))
        return type.replace("React.", "react.")
            .replace(" | undefined>", "?>")
            .replace("<boolean>", "<Boolean>")

    if (type.startsWith("Omit<"))
        return kotlinType(type.removePrefix("Omit<").substringBefore(", '"))

    if (type.startsWith("OmitKeyof<"))
        return kotlinType(type.removePrefix("OmitKeyof<").substringBefore(", '"))

    if (type.startsWith("DistributiveOmit<"))
        return kotlinType(type.removePrefix("DistributiveOmit<").substringBefore(", '"))

    if (type.startsWith("Exclude<"))
        return kotlinType(
            type.removePrefix("Exclude<")
                .substringBefore(", '")
                .substringBefore("['queryFn']")
        )

    if (type.startsWith("Pick<"))
        return kotlinType(type.removePrefix("Pick<").substringBefore(", '"))

    if (type.startsWith("WithRequired<"))
        return kotlinType(type.removePrefix("WithRequired<").substringBefore(", '"))

    if (type.endsWith(" | null") && type.indexOf("|") == type.lastIndexOf("|")) {
        return kotlinType(type.removeSuffix(" | null"), name) + "?"
    }

    if (SAFE_PREFIXES.any { type.startsWith(it) } && !type.startsWith("QueryKey |") && " | TOptions" !in type)
        return type
            .replace("<any", "<*")
            .replace(", any", ", *")
            .replace("<unknown", "<*")
            .replace(", unknown", ", *")
            .replace(", Error,", ", JsError,")
            .replace(" | undefined", "?")
            .let { t ->
                when {
                    t == "QueryObserverOptions<*, TError>"
                        -> t.replace(">", ", *, *, *, *>")

                    t == "QueryObserverOptions<*, *, *, *>"
                        -> t.replace(">", ", *, *>")

                    t.startsWith("QueryOptions<") && t.count { it == ',' } == 3
                        -> t.replace(">", ", *>")

                    t.startsWith("QueryBehavior<T") && t.count { it == ',' } == 2
                        -> t.replace(Regex(">$"), ", *>")

                    t.startsWith("Query<") && t.count { it == ',' } == 2
                        -> t.replace(Regex("(>\\??)$"), ", *$1")

                    else -> t
                }
            }
            .let { t ->
                if (t.endsWith("[]")) {
                    var itemType = kotlinType(type.removeSuffix("[]"))
                    itemType = when (itemType) {
                        "Mutation" -> itemType + "<*, *, *, *>"
                        "Query" -> itemType + "<*, *, *, *>"
                        "QueryObserverResult" -> itemType + "<*, *>"
                        else -> itemType
                    }

                    "ReadonlyArray<$itemType>"
                } else t
            }

    if (type.startsWith("() => "))
        return "() -> ${kotlinType(type.removePrefix("() => "))}"

    if (type.endsWith(" | undefined") && type.indexOf("|") == type.lastIndexOf("|")) {
        return kotlinType(type.removeSuffix(" | undefined"), name) + "?"
    }

    if (type.startsWith("undefined | ") && type.indexOf("|") == type.lastIndexOf("|")) {
        return kotlinType(type.removePrefix("undefined | "), name) + "?"
    }

    if (type.startsWith("Array<"))
        return "ReadonlyArray<${kotlinType(type.removeSurrounding("Array<", ">"), name)}>"

    if (type.startsWith("[") && type.endsWith("]")) {
        val (a, b) = type.removeSurrounding("[", "]")
            .split(", ")
            .map { kotlinType(it) }

        return "Tuple2<$a, $b>"
    }

    val promiseResult = type.removeSurrounding("Promise<", ">")
    if (promiseResult != type)
        return "$PROMISE<${kotlinType(promiseResult)}>"

    if (type == "Element | string")
        return kotlinType("Element")

    if (type.startsWith("<TPageData>"))
        return kotlinType(type.removePrefix("<TPageData>"))

    if (type.startsWith("(")) {
        if ("?" in type) {
            if (type.count { it == '?' } == 1) {
                val sourceType = type
                    .replaceFirst("?:", ":")
                    .replaceFirst(")", "?)")

                return kotlinFunctionType(sourceType)
            }
        } else {
            val sourceType = type
                .replace("Promise<TContext | undefined> | TContext | undefined", "Promise<TContext?>?")
                .replace(" | undefined", "?")
                .replace(" | null", "?")
                .replace(" | void", "?")

            if ("|" !in sourceType) {
                return kotlinFunctionType(sourceType)
            }
        }
    }

    if (type.startsWith("("))
        return type
            .replace(" | undefined", "?")
            .replace(" | null", "?")
            .replace("Mutation<unknown, unknown, unknown>", "Mutation<*, *, *, *>")
            .replace("Mutation<unknown, unknown, unknown, unknown>", "Mutation<*, *, *, *>")
            .replace(") => Promise<unknown> | unknown", ") -> Promise<*>?")
            .replace("unknown", "Any?")
            // hotfix
            .replace("Any??", "Any?")
            .replace(" => ", " -> ")

    if (" | " in type || " & " in type || type.startsWith("typeof "))
        return "Any /* $type */"

    if (type.startsWith("{"))
        return "Any /* $type */"

    return type
}

fun kotlinFunctionType(type: String): String =
    type.replace("=>", "->")
        .replace("void", "Unit")
        .replace("string", "String")
        .replace("number", "Int")
        .replace("?: boolean", ": Boolean?")
        .replace("boolean", "Boolean")
        .replace("Query)", "Query<*, *, *, *>)")
        .replace(Regex("(-> Query)$"), "$1<*, *, *, *>")
        .replace("TPageData[]", "ReadonlyArray<TPageData>")
        .replace("TQueryFnData[]", "ReadonlyArray<TQueryFnData>")
        .replace(": ReadonlyArray<QueryObserverResult>", ": ReadonlyArray<QueryObserverResult<*, *>>")
        .replace("Query<unknown, unknown, unknown>", "Query<*, *, *, *>")
        .replace(": Mutation)", ": Mutation<*, *, *, *>)")
        .replace("Mutation<any, any, any>", "Mutation<*, *, *, *>")
        .replace("Mutation<unknown, unknown, unknown>", "Mutation<*, *, *, *>")
        .replace("Mutation<unknown, unknown, unknown, unknown>", "Mutation<*, *, *, *>")
        .replace(
            "RefetchOptions & RefetchQueryFilters<TPageData>?",
            "RefetchOptions? /* & RefetchQueryFilters<TPageData> */"
        )
        .replace("ObserverFetchOptions", "ObserverFetchOptions<TData>")
        .replace("unknown", "Any")

fun String.fixDefaultOptions(): String =
    if (this == "DefaultOptions") "$this<*>" else this

private fun String.isClassLike(): Boolean =
    CLASS_REGEX.matches(this) && get(0) == get(0).uppercaseChar()
