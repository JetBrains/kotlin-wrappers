// Automatically generated - do not modify!

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
)

package react.query

typealias QueryKey = Union /* string | readonly unknown[] */

typealias EnsuredQueryKey<T> = Any

typealias QueryFunction<T, TQueryKey> = Union /* (context: QueryFunctionContext<TQueryKey>) => T | Promise<T> */

external interface QueryFunctionContext<TQueryKey : QueryKey, TPageParam> {
    var queryKey: EnsuredQueryKey<TQueryKey>
    var pageParam: TPageParam
}

typealias InitialDataFunction<T> = () -> T?

typealias PlaceholderDataFunction<TResult> = () -> TResult?

typealias QueryKeyHashFunction<TQueryKey> = (queryKey: TQueryKey) -> String

typealias GetPreviousPageParamFunction<TQueryFnData> = (firstPage: TQueryFnData, allPages: Array<out TQueryFnData>) -> Any

typealias GetNextPageParamFunction<TQueryFnData> = (lastPage: TQueryFnData, allPages: Array<out TQueryFnData>) -> Any

external interface InfiniteData<TData> {
    var pages: Array<out TData>
    var pageParams: Array<out PageParam>
}

external interface QueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    var retry: RetryValue<TError>
    var retryDelay: RetryDelayValue<TError>
    var cacheTime: Number
    var isDataEqual: (oldData: TData?, newData: TData) -> Boolean
    var queryFn: QueryFunction<TQueryFnData, TQueryKey>
    var queryHash: String
    var queryKey: TQueryKey
    var queryKeyHashFn: QueryKeyHashFunction<TQueryKey>
    var initialData: dynamic
    var initialDataUpdatedAt: dynamic
    var behavior: QueryBehavior<TQueryFnData, TError, TData, *>
    var structuralSharing: Boolean
    var getPreviousPageParam: GetPreviousPageParamFunction<TQueryFnData>
    var getNextPageParam: GetNextPageParamFunction<TQueryFnData>
    var _defaulted: Boolean
}

external interface QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey>
    : QueryOptions<TQueryFnData, TError, TQueryData, TQueryKey> {
    var enabled: Boolean
    var staleTime: Number
    var refetchInterval: dynamic
    var refetchIntervalInBackground: Boolean
    var refetchOnWindowFocus: dynamic
    var refetchOnReconnect: dynamic
    var refetchOnMount: dynamic
    var retryOnMount: Boolean
    var notifyOnChangeProps: dynamic
    var notifyOnChangePropsExclusions: dynamic
    var onSuccess: (data: TData) -> Unit
    var onError: (err: TError) -> Unit
    var onSettled: (data: TData?, error: TError?) -> Unit
    var useErrorBoundary: Boolean
    var select: (data: TQueryData) -> TData
    var suspense: Boolean
    var keepPreviousData: Boolean
    var placeholderData: dynamic
    var optimisticResults: Boolean
}

external interface InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey>
    : QueryObserverOptions<TQueryFnData, TError, InfiniteData<TData>, InfiniteData<TQueryData>, TQueryKey>

external interface FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey>
    : QueryOptions<TQueryFnData, TError, TData, TQueryKey> {
    var staleTime: Number
}

external interface FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey>
    : FetchQueryOptions<TQueryFnData, TError, InfiniteData<TData>, TQueryKey>

external interface ResultOptions {
    var throwOnError: Boolean
}

external interface RefetchOptions : ResultOptions {
    var cancelRefetch: Boolean
}

external interface InvalidateQueryFilters : QueryFilters {
    var refetchActive: Boolean
    var refetchInactive: Boolean
}

external interface InvalidateOptions {
    var throwOnError: Boolean
}

external interface ResetOptions {
    var throwOnError: Boolean
}

external interface FetchNextPageOptions : ResultOptions {
    var pageParam: PageParam
}

external interface FetchPreviousPageOptions : ResultOptions {
    var pageParam: PageParam
}

typealias QueryStatus = Status /* 'idle' | 'loading' | 'error' | 'success' */

external interface QueryObserverBaseResult<TData, TError> {
    val data: TData?
    val dataUpdatedAt: Number
    val error: TError?
    val errorUpdatedAt: Number
    val failureCount: Number
    val isError: Boolean
    val isFetched: Boolean
    val isFetchedAfterMount: Boolean
    val isFetching: Boolean
    val isIdle: Boolean
    val isLoading: Boolean
    val isLoadingError: Boolean
    val isPlaceholderData: Boolean
    val isPreviousData: Boolean
    val isRefetchError: Boolean
    val isStale: Boolean
    val isSuccess: Boolean
    val refetch: (options: RefetchOptions?) -> kotlin.js.Promise<QueryObserverResult<TData, TError>>
    val remove: () -> Unit
    val status: QueryStatus
}

external interface QueryObserverIdleResult<TData, TError>
    : QueryObserverBaseResult<TData, TError> {
    override val data: Nothing?
    override val error: Nothing?
    override val isError: False
    override val isIdle: True
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: False
    override val status: Status /* 'idle' */
}

external interface QueryObserverLoadingResult<TData, TError>
    : QueryObserverBaseResult<TData, TError> {
    override val data: Nothing?
    override val error: Nothing?
    override val isError: False
    override val isIdle: False
    override val isLoading: True
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: False
    override val status: Status /* 'loading' */
}

external interface QueryObserverLoadingErrorResult<TData, TError>
    : QueryObserverBaseResult<TData, TError> {
    override val data: Nothing?
    override val error: TError
    override val isError: True
    override val isIdle: False
    override val isLoading: False
    override val isLoadingError: True
    override val isRefetchError: False
    override val isSuccess: False
    override val status: Status /* 'error' */
}

external interface QueryObserverRefetchErrorResult<TData, TError>
    : QueryObserverBaseResult<TData, TError> {
    override val data: TData
    override val error: TError
    override val isError: True
    override val isIdle: False
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: True
    override val isSuccess: False
    override val status: Status /* 'error' */
}

external interface QueryObserverSuccessResult<TData, TError>
    : QueryObserverBaseResult<TData, TError> {
    override val data: TData
    override val error: Nothing?
    override val isError: False
    override val isIdle: False
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: True
    override val status: Status /* 'success' */
}

typealias QueryObserverResult<TData, TError> = Union /* QueryObserverIdleResult<TData, TError> | QueryObserverLoadingErrorResult<TData, TError> | QueryObserverLoadingResult<TData, TError> | QueryObserverRefetchErrorResult<TData, TError> | QueryObserverSuccessResult<TData, TError> */

external interface InfiniteQueryObserverBaseResult<TData, TError>
    : QueryObserverBaseResult<InfiniteData<TData>, TError> {
    val fetchNextPage: (options: FetchNextPageOptions?) -> kotlin.js.Promise<InfiniteQueryObserverResult<TData, TError>>
    val fetchPreviousPage: (options: FetchPreviousPageOptions?) -> kotlin.js.Promise<InfiniteQueryObserverResult<TData, TError>>
    val hasNextPage: Boolean
    val hasPreviousPage: Boolean
    val isFetchingNextPage: Boolean
    val isFetchingPreviousPage: Boolean
}

external interface InfiniteQueryObserverIdleResult<TData, TError>
    : InfiniteQueryObserverBaseResult<TData, TError> {
    override val data: Nothing?
    override val error: Nothing?
    override val isError: False
    override val isIdle: True
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: False
    override val status: Status /* 'idle' */
}

external interface InfiniteQueryObserverLoadingResult<TData, TError>
    : InfiniteQueryObserverBaseResult<TData, TError> {
    override val data: Nothing?
    override val error: Nothing?
    override val isError: False
    override val isIdle: False
    override val isLoading: True
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: False
    override val status: Status /* 'loading' */
}

external interface InfiniteQueryObserverLoadingErrorResult<TData, TError>
    : InfiniteQueryObserverBaseResult<TData, TError> {
    override val data: Nothing?
    override val error: TError
    override val isError: True
    override val isIdle: False
    override val isLoading: False
    override val isLoadingError: True
    override val isRefetchError: False
    override val isSuccess: False
    override val status: Status /* 'error' */
}

external interface InfiniteQueryObserverRefetchErrorResult<TData, TError>
    : InfiniteQueryObserverBaseResult<TData, TError> {
    override val data: InfiniteData<TData>
    override val error: TError
    override val isError: True
    override val isIdle: False
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: True
    override val isSuccess: False
    override val status: Status /* 'error' */
}

external interface InfiniteQueryObserverSuccessResult<TData, TError>
    : InfiniteQueryObserverBaseResult<TData, TError> {
    override val data: InfiniteData<TData>
    override val error: Nothing?
    override val isError: False
    override val isIdle: False
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: True
    override val status: Status /* 'success' */
}

typealias InfiniteQueryObserverResult<TData, TError> = Union /* InfiniteQueryObserverIdleResult<TData, TError> | InfiniteQueryObserverLoadingErrorResult<TData, TError> | InfiniteQueryObserverLoadingResult<TData, TError> | InfiniteQueryObserverRefetchErrorResult<TData, TError> | InfiniteQueryObserverSuccessResult<TData, TError> */

typealias MutationKey = Union /* string | readonly unknown[] */

typealias MutationStatus = Status /* 'idle' | 'loading' | 'success' | 'error' */

typealias MutationFunction<TData, TVariables> = (variables: TVariables) -> kotlin.js.Promise<TData>

external interface MutationOptions<TData, TError, TVariables, TContext> {
    var mutationFn: MutationFunction<TData, TVariables>
    var mutationKey: MutationKey
    var variables: TVariables
    var onMutate: (variables: TVariables) -> kotlin.js.Promise<TContext?>?
    var onSuccess: (data: TData, variables: TVariables, context: TContext) -> kotlin.js.Promise<Any>?
    var onError: (error: TError, variables: TVariables, context: TContext?) -> kotlin.js.Promise<Any>?
    var onSettled: (data: TData?, error: TError?, variables: TVariables, context: TContext?) -> kotlin.js.Promise<Any>?
    var retry: RetryValue<TError>
    var retryDelay: RetryDelayValue<TError>
    var _defaulted: Boolean
}

external interface MutationObserverOptions<TData, TError, TVariables, TContext>
    : MutationOptions<TData, TError, TVariables, TContext> {
    var useErrorBoundary: Boolean
}

external interface MutateOptions<TData, TError, TVariables, TContext> {
    var onSuccess: (data: TData, variables: TVariables, context: TContext) -> kotlin.js.Promise<Any>?
    var onError: (error: TError, variables: TVariables, context: TContext?) -> kotlin.js.Promise<Any>?
    var onSettled: (data: TData?, error: TError?, variables: TVariables, context: TContext?) -> kotlin.js.Promise<Any>?
}

typealias MutateFunction<TData, TError, TVariables, TContext> = (variables: TVariables, options: MutateOptions<TData, TError, TVariables, TContext>?) -> kotlin.js.Promise<TData>

external interface MutationObserverResult<TData, TError, TVariables, TContext>
    : MutationState<TData, TError, TVariables, TContext> {
    val isError: Boolean
    val isIdle: Boolean
    val isLoading: Boolean
    val isSuccess: Boolean
    val mutate: MutateFunction<TData, TError, TVariables, TContext>
    val reset: () -> Unit
}

external interface DefaultOptions<TError> {
    var queries: QueryObserverOptions<*, TError, *, *, *>
    var mutations: MutationObserverOptions<*, TError, *, *>
}
