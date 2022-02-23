// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.query

import kotlin.js.Promise

typealias QueryObserverListener<TData, TError> = (result: QueryObserverResult<TData, TError>) -> Unit

external interface NotifyOptions {
    var cache: Boolean
    var listeners: Boolean
    var onError: Boolean
    var onSuccess: Boolean
}

external interface ObserverFetchOptions : FetchOptions {
    var throwOnError: Boolean
}

open external class QueryObserver<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey>(
    client: QueryClient,
    options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>,
) : Subscribable<QueryObserverListener<TData, TError>> {
    open var options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>
    protected open fun bindMethods()
    override fun onSubscribe()
    override fun onUnsubscribe()
    open fun shouldFetchOnReconnect(): Boolean
    open fun shouldFetchOnWindowFocus(): Boolean
    open fun destroy()
    open fun setOptions(
        options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey> = definedExternally,
        notifyOptions: NotifyOptions = definedExternally,
    )

    open fun getOptimisticResult(options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>): QueryObserverResult<TData, TError>
    open fun getCurrentResult(): QueryObserverResult<TData, TError>
    open fun trackResult(
        result: QueryObserverResult<TData, TError>,
        defaultedOptions: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>,
    ): QueryObserverResult<TData, TError>

    open fun getNextResult(options: ResultOptions = definedExternally): Promise<QueryObserverResult<TData, TError>>
    open fun getCurrentQuery(): Query<TQueryFnData, TError, TQueryData, TQueryKey>
    open fun remove()
    open fun <TPageData> refetch(options: RefetchOptions /* & RefetchQueryFilters<TPageData> */ = definedExternally): Promise<QueryObserverResult<TData, TError>>
    open fun fetchOptimistic(options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>): Promise<QueryObserverResult<TData, TError>>
    protected open fun fetch(fetchOptions: ObserverFetchOptions = definedExternally): Promise<QueryObserverResult<TData, TError>>
    protected open fun createResult(
        query: Query<TQueryFnData, TError, TQueryData, TQueryKey>,
        options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>,
    ): QueryObserverResult<TData, TError>

    open fun updateResult(notifyOptions: NotifyOptions = definedExternally)
    open fun onQueryUpdate(action: Action<TData, TError>)
}
