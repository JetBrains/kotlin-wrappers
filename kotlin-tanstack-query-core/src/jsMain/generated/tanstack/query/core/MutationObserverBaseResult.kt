// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MutationObserverBaseResult<TData, TError, TVariables, TOnMutateResult> :
    MutationState<TData, TError, TVariables, TOnMutateResult> {
    override val data: TData?
    override val variables: TVariables?
    override val error: TError?
    val isError: Boolean
    val isIdle: Boolean
    val isPending: Boolean
    val isSuccess: Boolean
    override val status: MutationStatus
    val mutate: MutateFunction<TData, TError, TVariables, TOnMutateResult>
    val reset: () -> Unit
}
