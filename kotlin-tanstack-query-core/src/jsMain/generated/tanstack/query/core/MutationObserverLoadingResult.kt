// Automatically generated - do not modify!

package tanstack.query.core

import js.core.Void

external interface MutationObserverLoadingResult<TData, TError, TVariables, TContext>
    : MutationObserverResult<TData, TError, TVariables, TContext> {
    override val data: Void
    override val error: Void
    override val isError: False
    override val isIdle: False
    override val isLoading: True
    override val isSuccess: False
    override val status: MutationStatus /* 'loading' */
}
