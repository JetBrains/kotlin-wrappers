package karakum.query

fun parseParameters(source: String): List<String> {
    val params = source.substringAfter("(")
        .substringBefore("):")
        .takeIf { it.isNotEmpty() }
        ?: return emptyList()

    when (params) {
        "setup: (setFocused: (focused?: boolean) => void) => () => void",
        "setup: (setOnline: (online?: boolean) => void) => () => void",
            -> {
            val parameter = params
                .replace(" => ", " -> ")
                .replace("?: boolean", ": Boolean?")
                .replace("void", "Unit")

            return listOf(parameter)
        }

        "suspense: boolean | undefined, _useErrorBoundary: boolean | ((err: TError) => boolean) | undefined, error: TError",
            -> return params
            .replace(": boolean | ((", ": ((")
            .replace(" => ", " -> ")
            .replace(" boolean", " Boolean")
            .replace(" | undefined, ", "?, ")
            .split(", ")

        "options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey, TPageParam> | DefaultedQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>",
            -> return listOf(
            "options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey, TPageParam> /* | DefaultedQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey> */"
        )

        "options: WithRequired<FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey>, 'queryKey'>",
            -> return listOf(
            "options: FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey> /* required 'queryKey' */",
        )

        "result: QueryObserverResult<TData, TError>, onPropTracked?: (key: keyof QueryObserverResult) => void",
            -> return listOf(
            "result: QueryObserverResult<TData, TError>",
            "onPropTracked: (key: String /* keyof QueryObserverResult */) -> Unit = definedExternally",
        )

        "fetchOptions: ObserverFetchOptions",
            -> return listOf(
            "fetchOptions: ObserverFetchOptions<TData>",
        )
    }

    val parts = params.split(": ")
    return sequenceOf(parts.first())
        .plus(
            parts.drop(1).dropLast(1).flatMap {
                sequenceOf(
                    it.substringBeforeLast(", "),
                    it.substringAfterLast(", ")
                )
            }
        )
        .plus(parts.last())
        .windowed(2, 2)
        .map { (nameSource, typeSource) ->
            val name = nameSource.removeSuffix("?")
            val type = kotlinType(typeSource, name).fixDefaultOptions()
            val de = if (nameSource.endsWith("?")) {
                " = definedExternally"
            } else ""

            "$name: $type $de"
        }
        .toList()
}
