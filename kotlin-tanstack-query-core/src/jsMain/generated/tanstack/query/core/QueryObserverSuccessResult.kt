// Automatically generated - do not modify!

package tanstack.query.core

import js.core.Void

external interface QueryObserverSuccessResult<TData, TError>
    : QueryObserverResult<TData, TError> {
    override val data: TData
    override val error: Void
    override val isError: False
    override val isPending: False
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: True
    override val status: QueryStatus /* 'success' */
}
