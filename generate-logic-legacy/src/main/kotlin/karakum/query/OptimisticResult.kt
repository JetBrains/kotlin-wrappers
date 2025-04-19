package karakum.query

// language=TypeScript
internal val OPTIMISTIC_RESULT = """
[
        rawResult: Array<QueryObserverResult>,
        combineResult: (r?: Array<QueryObserverResult>) => TCombinedResult,
        trackResult: () => Array<QueryObserverResult>
    ]
""".trimIndent()

// language=kotlin
internal val QUERIES_OBSERVER_OPTIMISTIC_RESULT_CODE = """
typealias QueriesObserverOptimisticResult<TCombinedResult> = JsTuple3<
    /* rawResult: */ ReadonlyArray<QueryObserverResult<*, *>>,
    /* combineResult: */ (r: ReadonlyArray<QueryObserverResult<*, *>>?) -> TCombinedResult,
    /* trackResult */ () -> ReadonlyArray<QueryObserverResult<*, *>>,
>    
""".trimIndent()
