// Automatically generated - do not modify!

package tanstack.query.core

external interface QueryConfig<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    var cache: QueryCache
    var queryKey: TQueryKey
    var queryHash: String
    var logger: Logger
    var options: QueryOptions<TQueryFnData, TError, TData, TQueryKey>
    var defaultOptions: QueryOptions<TQueryFnData, TError, TData, TQueryKey>
    var state: QueryState<TData, TError>
}
