// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface QueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey, TPageParam> {
    val retry: RetryValue<TError>?
    val retryDelay: RetryDelayValue<TError>?
    val networkMode: NetworkMode?
    val gcTime: JsDuration?
    val queryFn: QueryFunctionOrSkipToken<TQueryFnData, TQueryKey, TPageParam>?
    val persister: QueryPersister<TQueryFnData, TQueryKey, TPageParam>?
    val queryHash: String?
    val queryKey: TQueryKey?
    val queryKeyHashFn: QueryKeyHashFunction<TQueryKey>?
    val initialData: InitialDataFunction<TData> /* | TData */?
    val initialDataUpdatedAt: Any /* number | (() => number | undefined) */?
    val behavior: QueryBehavior<TQueryFnData, TError, TData, TQueryKey>?
    val structuralSharing: Any /* boolean | ((oldData: unknown | undefined, newData: unknown) => unknown) */?
    val _defaulted: Boolean?
    val meta: QueryMeta?
    val maxPages: Int?
}
