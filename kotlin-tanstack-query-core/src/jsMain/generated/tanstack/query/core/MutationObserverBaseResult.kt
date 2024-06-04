// Automatically generated - do not modify!

package tanstack.query.core

external interface MutationObserverBaseResult<TData, TError, TVariables, TContext>
    : MutationState<TData, TError, TVariables, TContext> {
    override val data: TData?
    override val variables: TVariables?
    override val error: TError?
    val isError: Boolean
    val isIdle: Boolean
    val isPending: Boolean
    val isSuccess: Boolean
    override val status: MutationStatus
    val mutate: MutateFunction<TData, TError, TVariables, TContext>
    val reset: () -> Unit
}
