// Automatically generated - do not modify!

package tanstack.query.core

external interface QueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    var retry: RetryValue<TError>
    var retryDelay: RetryDelayValue<TError>
    var networkMode: NetworkMode
    var cacheTime: JsDuration
    var queryFn: QueryFunction<TQueryFnData, TQueryKey, *>
    var queryHash: String
    var queryKey: TQueryKey
    var queryKeyHashFn: QueryKeyHashFunction<TQueryKey>
    var initialData: InitialDataFunction<TData> /* | TData */
    var initialDataUpdatedAt: Any /* number | (() => number | undefined) */
    var behavior: QueryBehavior<TQueryFnData, TError, TData, *>
    var structuralSharing: (oldData: TData?, newData: TData) -> TData /* | boolean */
    var getPreviousPageParam: GetPreviousPageParamFunction<TQueryFnData>
    var getNextPageParam: GetNextPageParamFunction<TQueryFnData>
    var _defaulted: Boolean
    var meta: QueryMeta
}
