// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.query

typealias QueriesObserverListener = (result: Array<out QueryObserverResult<*, *>>) -> Unit

open external class QueriesObserver(
    client: QueryClient,
    queries: Array<out QueryObserverOptions<*, *, *, *, *>> = definedExternally,
) : Subscribable<QueriesObserverListener> {
    override fun onSubscribe()
    override fun onUnsubscribe()
    open fun destroy()
    open fun setQueries(
        queries: Array<out QueryObserverOptions<*, *, *, *, *>>,
        notifyOptions: NotifyOptions = definedExternally,
    )

    open fun getCurrentResult(): Array<out QueryObserverResult<*, *>>
    open fun getOptimisticResult(queries: Array<out QueryObserverOptions<*, *, *, *, *>>): Array<out QueryObserverResult<*, *>>
}
