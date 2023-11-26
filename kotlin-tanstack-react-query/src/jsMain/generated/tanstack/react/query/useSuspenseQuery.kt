// Automatically generated - do not modify!

@file:JsModule("@tanstack/react-query")

package tanstack.react.query

import tanstack.query.core.QueryClient
import tanstack.query.core.QueryKey

external fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> useSuspenseQuery(
    options: UseSuspenseQueryOptions<TQueryFnData, TError, TData, TQueryKey>,
    queryClient: QueryClient = definedExternally,
): UseSuspenseQueryResult<TData, TError>
