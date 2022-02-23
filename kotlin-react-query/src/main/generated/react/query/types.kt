// Automatically generated - do not modify!

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
)

package react.query

import kotlin.js.Promise

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
    var onMutate: (variables: TVariables) -> Promise<TContext?>?
    var onSuccess: (data: TData, variables: TVariables, context: TContext?) -> Promise<Any>?
    var onError: (error: TError, variables: TVariables, context: TContext?) -> Promise<Any>?
    var onSettled: (data: TData?, error: TError?, variables: TVariables, context: TContext?) -> Promise<Any>?
    var retry: RetryValue<TError>
    var retryDelay: RetryDelayValue<TError>
    var useErrorBoundary: (error: TError) -> Boolean
    var meta: MutationMeta
}

typealias UseMutateFunction<TData, TError, TVariables, TContext> = (variables: TVariables, options: MutateOptions<TData, TError, TVariables, TContext>?) -> Unit

typealias UseMutateAsyncFunction<TData, TError, TVariables, TContext> = (variables: TVariables, options: MutateOptions<TData, TError, TVariables, TContext>?) -> Promise<TData>

typealias UseBaseMutationResult<TData, TError, TVariables, TContext> = MutationObserverResult<TData, TError, TVariables, TContext>

typealias UseMutationResult<TData, TError, TVariables, TContext> = UseBaseMutationResult<TData, TError, TVariables, TContext>
