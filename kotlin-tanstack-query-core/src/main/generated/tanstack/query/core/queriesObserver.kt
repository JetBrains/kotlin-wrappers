// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package tanstack.query.core

import kotlinx.js.ReadonlyArray

typealias QueriesObserverListener = (result: ReadonlyArray<QueryObserverResult<*, *>>) -> Unit

open external class QueriesObserver(
    client: QueryClient,
    queries: ReadonlyArray<QueryObserverOptions<*, *, *, *, *>> = definedExternally,
) : Subscribable<QueriesObserverListener> {
    override fun onSubscribe()
    override fun onUnsubscribe()
    open fun destroy()
    open fun setQueries(
        queries: ReadonlyArray<QueryObserverOptions<*, *, *, *, *>>,
        notifyOptions: NotifyOptions = definedExternally,
    )

    open fun getCurrentResult(): ReadonlyArray<QueryObserverResult<*, *>>
    open fun getOptimisticResult(queries: ReadonlyArray<QueryObserverOptions<*, *, *, *, *>>): ReadonlyArray<QueryObserverResult<*, *>>
}
