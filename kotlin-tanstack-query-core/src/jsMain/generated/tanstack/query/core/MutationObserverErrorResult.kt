// Automatically generated - do not modify!

package tanstack.query.core

import js.core.Void

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
