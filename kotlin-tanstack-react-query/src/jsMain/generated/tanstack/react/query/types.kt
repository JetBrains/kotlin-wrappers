// Automatically generated - do not modify!

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
)

package tanstack.react.query

import tanstack.query.core.*

external interface ContextOptions {
    var context: react.Context<QueryClient?>
}

external interface UseBaseQueryOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey>
    : ContextOptions, QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>

external interface UseQueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey>
    : UseBaseQueryOptions<TQueryFnData, TError, TData, TQueryFnData, TQueryKey>

external interface UseInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey>
    : ContextOptions, InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>

typealias UseBaseQueryResult<TData, TError> = QueryObserverResult<TData, TError>

typealias UseQueryResult<TData, TError> = UseBaseQueryResult<TData, TError>

typealias DefinedUseBaseQueryResult<TData, TError> = DefinedQueryObserverResult<TData, TError>

typealias DefinedUseQueryResult<TData, TError> = DefinedUseBaseQueryResult<TData, TError>

typealias UseInfiniteQueryResult<TData, TError> = InfiniteQueryObserverResult<TData, TError>

external interface UseMutationOptions<TData, TError, TVariables, TContext>
    : ContextOptions, MutationObserverOptions<TData, TError, TVariables, TContext>

typealias UseMutateFunction<TData, TError, TVariables, TContext> = Function<Unit> /* (...args: Parameters<MutateFunction<TData, TError, TVariables, TContext>>) => void */

typealias UseMutateAsyncFunction<TData, TError, TVariables, TContext> = MutateFunction<TData, TError, TVariables, TContext>

external interface UseBaseMutationResult<TData, TError, TVariables, TContext> :
    MutationObserverResult<TData, TError, TVariables, TContext> {
    // override val mutate: UseMutateFunction<TData, TError, TVariables, TContext>
    val mutateAsync: UseMutateAsyncFunction<TData, TError, TVariables, TContext>
}

typealias UseMutationResult<TData, TError, TVariables, TContext> = UseBaseMutationResult<TData, TError, TVariables, TContext>
