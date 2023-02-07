// Automatically generated - do not modify!

@file:JsModule("@tanstack/react-query")
@file:JsNonModule

package tanstack.react.query

import tanstack.query.core.QueryFunction
import tanstack.query.core.QueryKey

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
