// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

import js.promise.Promise

open external class QueryObserver<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey>(
    client: QueryClient,
    options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey, *>,
) : Subscribable<QueryObserverListener<TData, TError>> {
    open var options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey, *>
    protected open fun bindMethods()
    override fun onSubscribe()
    override fun onUnsubscribe()
    open fun shouldFetchOnReconnect(): Boolean
    open fun shouldFetchOnWindowFocus(): Boolean
    open fun destroy()
    open fun setOptions(
        options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey, *> = definedExternally,
        notifyOptions: NotifyOptions = definedExternally,
    )

    open fun getOptimisticResult(options: DefaultedQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>): QueryObserverResult<TData, TError>
    open fun getCurrentResult(): QueryObserverResult<TData, TError>
    open fun trackResult(result: QueryObserverResult<TData, TError>): QueryObserverResult<TData, TError>
    open fun getCurrentQuery(): Query<TQueryFnData, TError, TQueryData, TQueryKey>
    open fun refetch(options: RefetchOptions = definedExternally): Promise<QueryObserverResult<TData, TError>>
    open fun fetchOptimistic(options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey, *>): Promise<QueryObserverResult<TData, TError>>
    protected open fun fetch(fetchOptions: ObserverFetchOptions): Promise<QueryObserverResult<TData, TError>>
    protected open fun createResult(
        query: Query<TQueryFnData, TError, TQueryData, TQueryKey>,
        options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey, *>,
    ): QueryObserverResult<TData, TError>

    open fun updateResult(notifyOptions: NotifyOptions = definedExternally)
    open fun onQueryUpdate()
}
