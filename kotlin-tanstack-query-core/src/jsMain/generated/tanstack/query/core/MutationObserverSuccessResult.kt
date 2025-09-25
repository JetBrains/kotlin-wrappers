// Automatically generated - do not modify!

package tanstack.query.core

import js.core.Void
import js.objects.JsPlainObject

@JsPlainObject
external interface MutationObserverSuccessResult<TData, TError, TVariables, TOnMutateResult> :
    MutationObserverResult<TData, TError, TVariables, TOnMutateResult> {
    override val data: TData
    override val error: Void
    override val variables: TVariables
    override val isError: False
    override val isIdle: False
    override val isPending: False
    override val isSuccess: True
    override val status: MutationStatus /* 'success' */
}
