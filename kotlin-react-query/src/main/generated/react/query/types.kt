// Automatically generated - do not modify!

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
)

package react.query

external interface UseBaseQueryOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey>
    : QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>

external interface UseQueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey>
    : UseBaseQueryOptions<TQueryFnData, TError, TData, TQueryFnData, TQueryKey>

external interface UseInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey>
    : InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>

typealias UseBaseQueryResult<TData, TError> = QueryObserverResult<TData, TError>

typealias UseQueryResult<TData, TError> = UseBaseQueryResult<TData, TError>

typealias UseInfiniteQueryResult<TData, TError> = InfiniteQueryObserverResult<TData, TError>

external interface UseMutationOptions<TData, TError, TVariables, TContext> {
    var mutationFn: MutationFunction<TData, TVariables>
    var mutationKey: MutationKey
    var onMutate: (variables: TVariables) -> kotlin.js.Promise<TContext?>?
    var onSuccess: (data: TData, variables: TVariables, context: TContext?) -> kotlin.js.Promise<Any>?
    var onError: (error: TError, variables: TVariables, context: TContext?) -> kotlin.js.Promise<Any>?
    var onSettled: (data: TData?, error: TError?, variables: TVariables, context: TContext?) -> kotlin.js.Promise<Any>?
    var retry: RetryValue<TError>
    var retryDelay: RetryDelayValue<TError>
    var useErrorBoundary: Boolean
}

typealias UseMutateFunction<TData, TError, TVariables, TContext> = (variables: TVariables, options: MutateOptions<TData, TError, TVariables, TContext>?) -> Unit

typealias UseMutateAsyncFunction<TData, TError, TVariables, TContext> = (variables: TVariables, options: MutateOptions<TData, TError, TVariables, TContext>?) -> kotlin.js.Promise<TData>

external interface UseMutationResult<TData, TError, TVariables, TContext> {
    val context: TContext?
    val data: TData?
    val error: TError?
    val failureCount: Int
    val isError: Boolean
    val isIdle: Boolean
    val isLoading: Boolean
    val isPaused: Boolean
    val isSuccess: Boolean
    val mutate: UseMutateFunction<TData, TError, TVariables, TContext>
    val mutateAsync: UseMutateAsyncFunction<TData, TError, TVariables, TContext>
    val reset: () -> Unit
    val status: MutationStatus
    val variables: TVariables?
}
