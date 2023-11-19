// Automatically generated - do not modify!

package tanstack.query.core

external interface QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey>
    : QueryOptions<TQueryFnData, TError, TQueryData, TQueryKey> {
    var enabled: Boolean
    var staleTime: JsDuration
    var refetchInterval: (data: TData?, query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) -> JsDuration /* | number | false */
    var refetchIntervalInBackground: Boolean
    var refetchOnWindowFocus: (query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) -> Boolean /* | boolean | 'always' */
    var refetchOnReconnect: (query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) -> Boolean /* | boolean | 'always' */
    var refetchOnMount: (query: Query<TQueryFnData, TError, TQueryData, TQueryKey>) -> Boolean /* | boolean | 'always' */
    var retryOnMount: Boolean
    var notifyOnChangeProps: NotifyOnChangeProps
    var onSuccess: (data: TData) -> Unit
    var onError: (err: TError) -> Unit
    var onSettled: (data: TData?, error: TError?) -> Unit
    var useErrorBoundary: UseErrorBoundary<TQueryFnData, TError, TQueryData, TQueryKey>
    var select: (data: TQueryData) -> TData
    var suspense: Boolean
    var keepPreviousData: Boolean
    var placeholderData: PlaceholderDataFunction<TQueryData> /* | TQueryData */
    var _optimisticResults: String /* 'optimistic' | 'isRestoring' */
}
