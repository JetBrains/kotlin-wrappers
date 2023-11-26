// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

import js.promise.Promise

open external class InfiniteQueryObserver<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey, TPageParam>(
    client: QueryClient,
    options: InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey, TPageParam>,
) : QueryObserver<TQueryFnData, TError, TData, InfiniteData<TQueryData, TPageParam>, TQueryKey> {
    open var subscribe: (listener: InfiniteQueryObserverListener<TData, TError>?) -> () -> Unit
    open var getCurrentResult: () -> InfiniteQueryObserverResult<TData, TError>
    protected open var fetch: (fetchOptions: ObserverFetchOptions) -> Promise<InfiniteQueryObserverResult<TData, TError>>
    override fun bindMethods()
    open fun setOptions(
        options: InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey, TPageParam> = definedExternally,
        notifyOptions: NotifyOptions = definedExternally,
    )

    override fun getOptimisticResult(options: DefaultedInfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey, TPageParam>): InfiniteQueryObserverResult<TData, TError>
    open fun fetchNextPage(options: FetchNextPageOptions = definedExternally): Promise<InfiniteQueryObserverResult<TData, TError>>
    open fun fetchPreviousPage(options: FetchPreviousPageOptions = definedExternally): Promise<InfiniteQueryObserverResult<TData, TError>>
    protected open fun createResult(
        query: Query<TQueryFnData, TError, InfiniteData<TQueryData, TPageParam>, TQueryKey>,
        options: InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey, TPageParam>,
    ): InfiniteQueryObserverResult<TData, TError>
}
