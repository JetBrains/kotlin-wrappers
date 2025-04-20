// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package tanstack.query.core

import js.array.JsTuple3
import js.array.ReadonlyArray
import js.errors.JsError

open external class QueriesObserver<TCombinedResult>(
    client: QueryClient,
    queries: ReadonlyArray<QueryObserverOptions<*, *, *, *, *, *>>,
    options: QueriesObserverOptions<TCombinedResult> = definedExternally,
) : Subscribable<QueriesObserverListener> {
    override fun onSubscribe()
    override fun onUnsubscribe()
    open fun destroy()
    open fun setQueries(
        queries: ReadonlyArray<QueryObserverOptions<*, *, *, *, *, *>>,
        options: QueriesObserverOptions<TCombinedResult> = definedExternally,
    )

    open fun getCurrentResult(): ReadonlyArray<QueryObserverResult<*, *>>
    open fun getQueries(): ReadonlyArray<Query<*, JsError, *, QueryKey>>
    open fun getObservers(): ReadonlyArray<QueryObserver<*, JsError, *, *, QueryKey>>
    open fun getOptimisticResult(
        queries: ReadonlyArray<QueryObserverOptions<*, *, *, *, *, *>>,
        combine: CombineFn<TCombinedResult>?,
    ): QueriesObserverOptimisticResult<TCombinedResult>
}

typealias QueriesObserverOptimisticResult<TCombinedResult> = JsTuple3<
        /* rawResult: */ ReadonlyArray<QueryObserverResult<*, *>>,
        /* combineResult: */ (r: ReadonlyArray<QueryObserverResult<*, *>>?) -> TCombinedResult,
        /* trackResult */ () -> ReadonlyArray<QueryObserverResult<*, *>>,
        >
