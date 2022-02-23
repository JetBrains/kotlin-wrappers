// Automatically generated - do not modify!

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
)

package react.query

import kotlinx.js.ReadonlyArray
import kotlinx.js.Void
import kotlin.js.Promise

typealias QueryKey = Union /* string | readonly unknown[] */

typealias EnsuredQueryKey<T> = Any

typealias QueryFunction<T, TQueryKey> = (context: QueryFunctionContext<TQueryKey, *>) -> Promise<T>

external interface QueryFunctionContext<TQueryKey : QueryKey, TPageParam> {
    var queryKey: EnsuredQueryKey<TQueryKey>
    var signal: org.w3c.fetch.AbortSignal
    var pageParam: TPageParam
    var meta: QueryMeta?
}

typealias InitialDataFunction<T> = () -> T?

typealias PlaceholderDataFunction<TResult> = () -> TResult?

typealias QueryKeyHashFunction<TQueryKey> = (queryKey: TQueryKey) -> String

typealias GetPreviousPageParamFunction<TQueryFnData> = (firstPage: TQueryFnData, allPages: ReadonlyArray<TQueryFnData>) -> Any

typealias GetNextPageParamFunction<TQueryFnData> = (lastPage: TQueryFnData, allPages: ReadonlyArray<TQueryFnData>) -> Any

external interface InfiniteData<TData> {
    var pages: ReadonlyArray<TData>
    var pageParams: ReadonlyArray<PageParam>
}

typealias QueryMeta = Any

external interface QueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    var retry: RetryValue<TError>
    var retryDelay: RetryDelayValue<TError>
    var cacheTime: JsDuration
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
    var meta: QueryMeta
}

external interface QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey>
    : QueryOptions<TQueryFnData, TError, TQueryData, TQueryKey> {
    var enabled: Boolean
    var staleTime: JsDuration
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
    var useErrorBoundary: (error: TError) -> Boolean
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
    var staleTime: JsDuration
}

external interface FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey>
    : FetchQueryOptions<TQueryFnData, TError, InfiniteData<TData>, TQueryKey>

external interface ResultOptions {
    var throwOnError: Boolean
}

external interface RefetchPageFilters<TPageData> {
    var refetchPage: (lastPage: TPageData, index: Int, allPages: ReadonlyArray<TPageData>) -> Boolean
}

external interface RefetchOptions : ResultOptions {
    var cancelRefetch: Boolean
}

external interface InvalidateQueryFilters<TPageData>
    : QueryFilters, RefetchPageFilters<TPageData> {
    var refetchActive: Boolean
    var refetchInactive: Boolean
}

external interface RefetchQueryFilters<TPageData>
    : QueryFilters, RefetchPageFilters<TPageData>

external interface ResetQueryFilters<TPageData>
    : QueryFilters, RefetchPageFilters<TPageData>

external interface InvalidateOptions : RefetchOptions

external interface ResetOptions : RefetchOptions

external interface FetchNextPageOptions : ResultOptions {
    var cancelRefetch: Boolean
    var pageParam: PageParam
}

external interface FetchPreviousPageOptions : ResultOptions {
    var cancelRefetch: Boolean
    var pageParam: PageParam
}

external interface QueryObserverBaseResult<TData, TError> {
    val data: TData?
    val dataUpdatedAt: JsTimestamp
    val error: TError?
    val errorUpdatedAt: JsTimestamp
    val failureCount: Int
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
    val isRefetching: Boolean
    val isStale: Boolean
    val isSuccess: Boolean
    val refetch: (options: RefetchOptions? /* & RefetchQueryFilters<TPageData> */) -> Promise<QueryObserverResult<TData, TError>>
    val remove: () -> Unit
    val status: QueryStatus
}

external interface QueryObserverIdleResult<TData, TError>
    : QueryObserverResult<TData, TError> {
    override val data: Void
    override val error: Void
    override val isError: False
    override val isIdle: True
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: False
    override val status: QueryStatus /* 'idle' */
}

external interface QueryObserverLoadingResult<TData, TError>
    : QueryObserverResult<TData, TError> {
    override val data: Void
    override val error: Void
    override val isError: False
    override val isIdle: False
    override val isLoading: True
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: False
    override val status: QueryStatus /* 'loading' */
}

external interface QueryObserverLoadingErrorResult<TData, TError>
    : QueryObserverResult<TData, TError> {
    override val data: Void
    override val error: TError
    override val isError: True
    override val isIdle: False
    override val isLoading: False
    override val isLoadingError: True
    override val isRefetchError: False
    override val isSuccess: False
    override val status: QueryStatus /* 'error' */
}

external interface QueryObserverRefetchErrorResult<TData, TError>
    : QueryObserverResult<TData, TError> {
    override val data: TData
    override val error: TError
    override val isError: True
    override val isIdle: False
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: True
    override val isSuccess: False
    override val status: QueryStatus /* 'error' */
}

external interface QueryObserverSuccessResult<TData, TError>
    : QueryObserverResult<TData, TError> {
    override val data: TData
    override val error: Void
    override val isError: False
    override val isIdle: False
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: True
    override val status: QueryStatus /* 'success' */
}

sealed external interface QueryObserverResult<TData, TError>
    : QueryObserverBaseResult<TData, TError>

external interface InfiniteQueryObserverBaseResult<TData, TError>
    : QueryObserverResult<InfiniteData<TData>, TError> {
    val fetchNextPage: (options: FetchNextPageOptions?) -> Promise<InfiniteQueryObserverResult<TData, TError>>
    val fetchPreviousPage: (options: FetchPreviousPageOptions?) -> Promise<InfiniteQueryObserverResult<TData, TError>>
    val hasNextPage: Boolean
    val hasPreviousPage: Boolean
    val isFetchingNextPage: Boolean
    val isFetchingPreviousPage: Boolean
}

external interface InfiniteQueryObserverIdleResult<TData, TError>
    : InfiniteQueryObserverResult<TData, TError> {
    override val data: Void
    override val error: Void
    override val isError: False
    override val isIdle: True
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: False
    override val status: QueryStatus /* 'idle' */
}

external interface InfiniteQueryObserverLoadingResult<TData, TError>
    : InfiniteQueryObserverResult<TData, TError> {
    override val data: Void
    override val error: Void
    override val isError: False
    override val isIdle: False
    override val isLoading: True
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: False
    override val status: QueryStatus /* 'loading' */
}

external interface InfiniteQueryObserverLoadingErrorResult<TData, TError>
    : InfiniteQueryObserverResult<TData, TError> {
    override val data: Void
    override val error: TError
    override val isError: True
    override val isIdle: False
    override val isLoading: False
    override val isLoadingError: True
    override val isRefetchError: False
    override val isSuccess: False
    override val status: QueryStatus /* 'error' */
}

external interface InfiniteQueryObserverRefetchErrorResult<TData, TError>
    : InfiniteQueryObserverResult<TData, TError> {
    override val data: InfiniteData<TData>
    override val error: TError
    override val isError: True
    override val isIdle: False
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: True
    override val isSuccess: False
    override val status: QueryStatus /* 'error' */
}

external interface InfiniteQueryObserverSuccessResult<TData, TError>
    : InfiniteQueryObserverResult<TData, TError> {
    override val data: InfiniteData<TData>
    override val error: Void
    override val isError: False
    override val isIdle: False
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: True
    override val status: QueryStatus /* 'success' */
}

sealed external interface InfiniteQueryObserverResult<TData, TError>
    : InfiniteQueryObserverBaseResult<TData, TError>

typealias MutationKey = Union /* string | readonly unknown[] */

typealias MutationMeta = Any

typealias MutationFunction<TData, TVariables> = (variables: TVariables) -> Promise<TData>

external interface MutationOptions<TData, TError, TVariables, TContext> {
    var mutationFn: MutationFunction<TData, TVariables>
    var mutationKey: MutationKey
    var variables: TVariables
    var onMutate: (variables: TVariables) -> Promise<TContext?>?
    var onSuccess: (data: TData, variables: TVariables, context: TContext) -> Promise<Any>?
    var onError: (error: TError, variables: TVariables, context: TContext?) -> Promise<Any>?
    var onSettled: (data: TData?, error: TError?, variables: TVariables, context: TContext?) -> Promise<Any>?
    var retry: RetryValue<TError>
    var retryDelay: RetryDelayValue<TError>
    var _defaulted: Boolean
    var meta: MutationMeta
}

external interface MutationObserverOptions<TData, TError, TVariables, TContext>
    : MutationOptions<TData, TError, TVariables, TContext> {
    var useErrorBoundary: (error: TError) -> Boolean
}

external interface MutateOptions<TData, TError, TVariables, TContext> {
    var onSuccess: (data: TData, variables: TVariables, context: TContext) -> Promise<Any>?
    var onError: (error: TError, variables: TVariables, context: TContext?) -> Promise<Any>?
    var onSettled: (data: TData?, error: TError?, variables: TVariables, context: TContext?) -> Promise<Any>?
}

typealias MutateFunction<TData, TError, TVariables, TContext> = (variables: TVariables, options: MutateOptions<TData, TError, TVariables, TContext>?) -> Promise<TData>

external interface MutationObserverBaseResult<TData, TError, TVariables, TContext>
    : MutationState<TData, TError, TVariables, TContext> {
    val isError: Boolean
    val isIdle: Boolean
    val isLoading: Boolean
    val isSuccess: Boolean
    val mutate: MutateFunction<TData, TError, TVariables, TContext>
    val reset: () -> Unit
}

external interface MutationObserverIdleResult<TData, TError, TVariables, TContext>
    : MutationObserverResult<TData, TError, TVariables, TContext> {
    override val data: Void
    override val error: Void
    override val isError: False
    override val isIdle: True
    override val isLoading: False
    override val isSuccess: False
    override val status: MutationStatus /* 'idle' */
}

external interface MutationObserverLoadingResult<TData, TError, TVariables, TContext>
    : MutationObserverResult<TData, TError, TVariables, TContext> {
    override val data: Void
    override val error: Void
    override val isError: False
    override val isIdle: False
    override val isLoading: True
    override val isSuccess: False
    override val status: MutationStatus /* 'loading' */
}

external interface MutationObserverErrorResult<TData, TError, TVariables, TContext>
    : MutationObserverResult<TData, TError, TVariables, TContext> {
    override val data: Void
    override val error: TError
    override val isError: True
    override val isIdle: False
    override val isLoading: False
    override val isSuccess: False
    override val status: MutationStatus /* 'error' */
}

external interface MutationObserverSuccessResult<TData, TError, TVariables, TContext>
    : MutationObserverResult<TData, TError, TVariables, TContext> {
    override val data: TData
    override val error: Void
    override val isError: False
    override val isIdle: False
    override val isLoading: False
    override val isSuccess: True
    override val status: MutationStatus /* 'success' */
}

sealed external interface MutationObserverResult<TData, TError, TVariables, TContext>
    : MutationObserverBaseResult<TData, TError, TVariables, TContext>

external interface DefaultOptions<TError> {
    var queries: QueryObserverOptions<*, TError, *, *, *>
    var mutations: MutationObserverOptions<*, TError, *, *>
}

external interface CancelOptions {
    var revert: Boolean
    var silent: Boolean
}

external interface SetDataOptions {
    var updatedAt: JsTimestamp
}
