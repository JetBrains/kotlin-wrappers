// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

package react.query

external fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> useQuery(options: UseQueryOptions<TQueryFnData, TError, TData, TQueryKey>): UseQueryResult<TData, TError>

external fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> useQuery(
    queryKey: TQueryKey,
    options: UseQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
): UseQueryResult<TData, TError>

external fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> useQuery(
    queryKey: TQueryKey,
    queryFn: QueryFunction<TQueryFnData, TQueryKey>,
    options: UseQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
): UseQueryResult<TData, TError>
