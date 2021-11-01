// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.query

external interface QueryConfig<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    var cache: QueryCache
    var queryKey: TQueryKey
    var queryHash: String
    var options: QueryOptions<TQueryFnData, TError, TData, TQueryKey>
    var defaultOptions: QueryOptions<TQueryFnData, TError, TData, TQueryKey>
    var state: QueryState<TData, TError>
    var meta: QueryMeta?
}

external interface QueryState<TData, TError> {
    var data: TData?
    var dataUpdateCount: Int
    var dataUpdatedAt: JsTimestamp
    var error: TError?
    var errorUpdateCount: Int
    var errorUpdatedAt: JsTimestamp
    var fetchFailureCount: Int
    var fetchMeta: Any
    var isFetching: Boolean
    var isInvalidated: Boolean
    var isPaused: Boolean
    var status: QueryStatus
}

external interface FetchContext<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    var fetchFn: () -> dynamic
    var fetchOptions: FetchOptions
    var options: QueryOptions<TQueryFnData, TError, TData, *>
    var queryKey: EnsuredQueryKey<TQueryKey>
    var state: QueryState<TData, TError>
    var meta: QueryMeta?
}

external interface QueryBehavior<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    var onFetch: (context: FetchContext<TQueryFnData, TError, TData, TQueryKey>) -> Unit
}

external interface FetchOptions {
    var cancelRefetch: Boolean
    var meta: Any
}

external interface FailedAction {
    var type: Type /* 'failed' */
}

external interface FetchAction {
    var type: Type /* 'fetch' */
    var meta: Any
}

external interface SuccessAction<TData> {
    var data: TData?
    var type: Type /* 'success' */
    var dataUpdatedAt: JsTimestamp
}

external interface ErrorAction<TError> {
    var type: Type /* 'error' */
    var error: TError
}

external interface InvalidateAction {
    var type: Type /* 'invalidate' */
}

external interface PauseAction {
    var type: Type /* 'pause' */
}

external interface ContinueAction {
    var type: Type /* 'continue' */
}

external interface SetStateAction<TData, TError> {
    var type: Type /* 'setState' */
    var state: QueryState<TData, TError>
    var setStateOptions: SetStateOptions
}

typealias Action<TData, TError> = Union /* ContinueAction | ErrorAction<TError> | FailedAction | FetchAction | InvalidateAction | PauseAction | SetStateAction<TData, TError> | SuccessAction<TData> */

external interface SetStateOptions {
    var meta: Any
}

open external class Query<TQueryFnData, TError, TData, TQueryKey : QueryKey>(config: QueryConfig<TQueryFnData, TError, TData, TQueryKey>) {
    open var queryKey: TQueryKey
    open var queryHash: String
    open var options: QueryOptions<TQueryFnData, TError, TData, TQueryKey>
    open var initialState: QueryState<TData, TError>
    open var revertState: QueryState<TData, TError>
    open var state: QueryState<TData, TError>
    open var cacheTime: JsDuration
    open var meta: QueryMeta?
    open fun setDefaultOptions(options: QueryOptions<TQueryFnData, TError, TData, TQueryKey>)
    open fun setData(
        updater: Updater<TData?, TData>,
        options: SetDataOptions = definedExternally,
    ): TData

    open fun setState(
        state: QueryState<TData, TError>,
        setStateOptions: SetStateOptions = definedExternally,
    )

    open fun cancel(options: CancelOptions = definedExternally): kotlin.js.Promise<Unit>
    open fun destroy()
    open fun reset()
    open fun isActive(): Boolean
    open fun isFetching(): Boolean
    open fun isStale(): Boolean
    open fun isStaleByTime(staleTime: JsDuration = definedExternally): Boolean
    open fun onFocus()
    open fun onOnline()
    open fun addObserver(observer: QueryObserver<*, *, *, *, *>)
    open fun removeObserver(observer: QueryObserver<*, *, *, *, *>)
    open fun getObserversCount(): Int
    open fun invalidate()
    open fun fetch(
        options: QueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
        fetchOptions: FetchOptions = definedExternally,
    ): kotlin.js.Promise<TData>

    protected open fun getDefaultState(options: QueryOptions<TQueryFnData, TError, TData, TQueryKey>): QueryState<TData, TError>
    protected open fun reducer(
        state: QueryState<TData, TError>,
        action: Action<TData, TError>,
    ): QueryState<TData, TError>
}
