// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.query

typealias InfiniteQueryObserverListener<TData, TError> = (result: InfiniteQueryObserverResult<TData, TError>) -> Unit

open external class InfiniteQueryObserver<TQueryFnData, TError, TData, TQueryData>(
    client: QueryClient,
    options: InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, *>,
) : QueryObserver<TQueryFnData, TError, InfiniteData<TData>, InfiniteData<TQueryData>, QueryKey> {
    open var subscribe: (listener: InfiniteQueryObserverListener<TData, TError>?) -> () -> Unit
    open var getCurrentResult: () -> InfiniteQueryObserverResult<TData, TError>
    protected open var fetch: (fetchOptions: ObserverFetchOptions?) -> kotlin.js.Promise<InfiniteQueryObserverResult<TData, TError>>
    override fun bindMethods()
    open fun setOptions(
        options: InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, *> = definedExternally,
        notifyOptions: NotifyOptions = definedExternally,
    )

    open fun getOptimisticResult(options: InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, *>): InfiniteQueryObserverResult<TData, TError>
    open fun fetchNextPage(options: FetchNextPageOptions = definedExternally): kotlin.js.Promise<InfiniteQueryObserverResult<TData, TError>>
    open fun fetchPreviousPage(options: FetchPreviousPageOptions = definedExternally): kotlin.js.Promise<InfiniteQueryObserverResult<TData, TError>>
    protected open fun createResult(
        query: Query<TQueryFnData, TError, InfiniteData<TQueryData>, *>,
        options: InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, *>,
    ): InfiniteQueryObserverResult<TData, TError>
}
