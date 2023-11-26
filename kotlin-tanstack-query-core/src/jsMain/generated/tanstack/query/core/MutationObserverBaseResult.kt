// Automatically generated - do not modify!

package tanstack.query.core

external interface MutationObserverBaseResult<TData, TError, TVariables, TContext>
    : MutationState<TData, TError, TVariables, TContext> {
    val isError: Boolean
    val isIdle: Boolean
    val isPending: Boolean
    val isSuccess: Boolean
    val mutate: MutateFunction<TData, TError, TVariables, TContext>
    val reset: () -> Unit
}
