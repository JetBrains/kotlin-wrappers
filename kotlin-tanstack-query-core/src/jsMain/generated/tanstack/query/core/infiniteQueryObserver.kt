// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")
@file:JsNonModule

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package tanstack.query.core

import kotlin.js.Promise

typealias InfiniteQueryObserverListener<TData, TError> = (result: InfiniteQueryObserverResult<TData, TError>) -> Unit

open external class InfiniteQueryObserver<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey>(
    client: QueryClient,
    options: InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>,
) : QueryObserver<TQueryFnData, TError, InfiniteData<TData>, InfiniteData<TQueryData>, TQueryKey> {
    open var subscribe: (listener: InfiniteQueryObserverListener<TData, TError>?) -> () -> Unit
    open var getCurrentResult: () -> InfiniteQueryObserverResult<TData, TError>
    protected open var fetch: (fetchOptions: ObserverFetchOptions) -> Promise<InfiniteQueryObserverResult<TData, TError>>
    override fun bindMethods()
    open fun setOptions(
        options: InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey> = definedExternally,
        notifyOptions: NotifyOptions = definedExternally,
    )

    override fun getOptimisticResult(options: DefaultedInfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>): InfiniteQueryObserverResult<TData, TError>
    open fun fetchNextPage(options: FetchNextPageOptions = definedExternally): Promise<InfiniteQueryObserverResult<TData, TError>>
    open fun fetchPreviousPage(options: FetchPreviousPageOptions = definedExternally): Promise<InfiniteQueryObserverResult<TData, TError>>
    protected open fun createResult(
        query: Query<TQueryFnData, TError, InfiniteData<TQueryData>, TQueryKey>,
        options: InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>,
    ): InfiniteQueryObserverResult<TData, TError>
}
