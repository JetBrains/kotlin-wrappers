// Automatically generated - do not modify!

package tanstack.query.core

external interface QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey, TPageParam>
    : QueryOptions<TQueryFnData, TError, TQueryData, TQueryKey, TPageParam> {
    var enabled: Boolean
    var staleTime: JsDuration
    var refetchInterval: Any /* number | false | ((query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) => number | false | undefined) */
    var refetchIntervalInBackground: Boolean
    var refetchOnWindowFocus: (query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) -> Boolean /* | boolean | 'always' */
    var refetchOnReconnect: (query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) -> Boolean /* | boolean | 'always' */
    var refetchOnMount: (query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) -> Boolean /* | boolean | 'always' */
    var retryOnMount: Boolean
    var notifyOnChangeProps: NotifyOnChangeProps
    var throwOnError: ThrowOnError<TQueryFnData, TError, TQueryData, TQueryKey>
    var select: (data: TQueryData) -> TData
    var suspense: Boolean
    var placeholderData: Any /* NonFunctionGuard<TQueryData> | PlaceholderDataFunction<NonFunctionGuard<TQueryData>, TError, NonFunctionGuard<TQueryData>, TQueryKey> */
    var _optimisticResults: String /* 'optimistic' | 'isRestoring' */
}
