// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey, TPageParam>
    : QueryOptions<TQueryFnData, TError, TQueryData, TQueryKey, TPageParam> {
    val enabled: Enabled<TQueryFnData, TError, TQueryData, TQueryKey>?
    val staleTime: StaleTime<TQueryFnData, TError, TQueryData, TQueryKey>?
    val refetchInterval: Any /* number | false | ((query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) => number | false | undefined) */?
    val refetchIntervalInBackground: Boolean?
    val refetchOnWindowFocus: ((query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) -> Boolean /* | boolean | 'always' */)?
    val refetchOnReconnect: ((query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) -> Boolean /* | boolean | 'always' */)?
    val refetchOnMount: ((query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) -> Boolean /* | boolean | 'always' */)?
    val retryOnMount: Boolean?
    val notifyOnChangeProps: NotifyOnChangeProps?
    val throwOnError: ThrowOnError<TQueryFnData, TError, TQueryData, TQueryKey>?
    val select: ((data: TQueryData) -> TData)?
    val suspense: Boolean?
    val placeholderData: Any /* NonFunctionGuard<TQueryData> | PlaceholderDataFunction<NonFunctionGuard<TQueryData>, TError, NonFunctionGuard<TQueryData>, TQueryKey> */?
    val _optimisticResults: String /* 'optimistic' | 'isRestoring' */?
    val experimental_prefetchInRender: Boolean?
}
