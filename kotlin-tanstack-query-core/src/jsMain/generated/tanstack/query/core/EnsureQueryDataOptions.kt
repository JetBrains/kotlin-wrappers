// Automatically generated - do not modify!

package tanstack.query.core

external interface EnsureQueryDataOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey, TPageParam>
    : FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey, TPageParam> {
    var revalidateIfStale: Boolean
}
