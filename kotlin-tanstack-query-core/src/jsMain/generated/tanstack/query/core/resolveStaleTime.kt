// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

external fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> resolveStaleTime(
    staleTime: StaleTimeFunction<TQueryFnData, TError, TData, TQueryKey>?,
    query: Query<TQueryFnData, TError, TData, TQueryKey>,
): StaleTime?
