// Automatically generated - do not modify!

package tanstack.query.core

import js.core.Void

external interface MutationObserverSuccessResult<TData, TError, TVariables, TContext>
    : MutationObserverResult<TData, TError, TVariables, TContext> {
    override val data: TData
    override val error: Void
    override val isError: False
    override val isIdle: False
    override val isLoading: False
    override val isSuccess: True
    override val status: MutationStatus /* 'success' */
}
