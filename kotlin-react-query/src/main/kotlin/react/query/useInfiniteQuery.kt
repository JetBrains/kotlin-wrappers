// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

package react.query

external fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> useInfiniteQuery(options: UseInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryFnData, TQueryKey>): UseInfiniteQueryResult<TData, TError>

external fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> useInfiniteQuery(
    queryKey: TQueryKey,
    options: UseInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryFnData, TQueryKey> = definedExternally,
): UseInfiniteQueryResult<TData, TError>

external fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> useInfiniteQuery(
    queryKey: TQueryKey,
    queryFn: QueryFunction<TQueryFnData, TQueryKey>,
    options: UseInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryFnData, TQueryKey> = definedExternally,
): UseInfiniteQueryResult<TData, TError>
