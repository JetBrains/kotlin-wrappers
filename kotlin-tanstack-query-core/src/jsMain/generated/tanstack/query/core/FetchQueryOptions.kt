// Automatically generated - do not modify!

package tanstack.query.core

external interface FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey, TPageParam>
    : QueryOptions<TQueryFnData, TError, TData, TQueryKey, TPageParam> {
    var staleTime: JsDuration
}
