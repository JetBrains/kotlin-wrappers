// Automatically generated - do not modify!

package tanstack.query.core

// @JsPlainObject
// Details - https://youtrack.jetbrains.com/issue/KT-70664
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
