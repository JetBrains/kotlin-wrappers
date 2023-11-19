// Automatically generated - do not modify!

package tanstack.query.core

external interface FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey>
    : QueryOptions<TQueryFnData, TError, TData, TQueryKey> {
    var staleTime: JsDuration
}
