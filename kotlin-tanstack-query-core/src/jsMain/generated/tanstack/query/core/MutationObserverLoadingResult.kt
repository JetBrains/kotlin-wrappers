// Automatically generated - do not modify!

package tanstack.query.core

import js.core.Void
import js.objects.JsPlainObject

@JsPlainObject
external interface MutationObserverLoadingResult<TData, TError, TVariables, TContext>
    : MutationObserverResult<TData, TError, TVariables, TContext> {
    override val data: Void
    override val variables: TVariables
    override val error: Void
    override val isError: False
    override val isIdle: False
    override val isPending: True
    override val isSuccess: False
    override val status: MutationStatus /* 'pending' */
}
