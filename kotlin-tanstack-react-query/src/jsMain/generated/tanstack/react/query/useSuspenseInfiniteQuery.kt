// Automatically generated - do not modify!

@file:JsModule("@tanstack/react-query")

package tanstack.react.query

import tanstack.query.core.QueryClient
import tanstack.query.core.QueryKey

external fun <TQueryFnData, TError, TData, TQueryKey : QueryKey, TPageParam> useSuspenseInfiniteQuery(
    options: UseSuspenseInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryFnData, TQueryKey, TPageParam>,
    queryClient: QueryClient = definedExternally,
): UseSuspenseInfiniteQueryResult<TData, TError>
