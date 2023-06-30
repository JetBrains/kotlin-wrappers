// Automatically generated - do not modify!

@file:JsModule("@tanstack/react-query")

package tanstack.react.query

import tanstack.query.core.QueryFunction
import tanstack.query.core.QueryKey

external fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> useQuery(options: UseQueryOptions<TQueryFnData, TError, TData, TQueryKey>): UseQueryResult<TData, TError>

external fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> useQuery(
    queryKey: TQueryKey,
    options: UseQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
): UseQueryResult<TData, TError>

external fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> useQuery(
    queryKey: TQueryKey,
    queryFn: QueryFunction<TQueryFnData, TQueryKey, *>,
    options: UseQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
): UseQueryResult<TData, TError>
