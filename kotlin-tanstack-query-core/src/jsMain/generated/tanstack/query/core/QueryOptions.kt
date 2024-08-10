// Automatically generated - do not modify!

package tanstack.query.core

external interface QueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey, TPageParam> {
    var retry: RetryValue<TError>
    var retryDelay: RetryDelayValue<TError>
    var networkMode: NetworkMode
    var gcTime: JsDuration
    var queryFn: QueryFunctionOrSkipToken<TQueryFnData, TQueryKey, TPageParam>
    var persister: QueryPersister<TQueryFnData, TQueryKey, TPageParam>
    var queryHash: String
    var queryKey: TQueryKey
    var queryKeyHashFn: QueryKeyHashFunction<TQueryKey>
    var initialData: InitialDataFunction<TData> /* | TData */
    var initialDataUpdatedAt: Any /* number | (() => number | undefined) */
    var behavior: QueryBehavior<TQueryFnData, TError, TData, TQueryKey>
    var structuralSharing: Any /* boolean | ((oldData: unknown | undefined, newData: unknown) => unknown) */
    var _defaulted: Boolean
    var meta: QueryMeta
    var maxPages: Int
}
