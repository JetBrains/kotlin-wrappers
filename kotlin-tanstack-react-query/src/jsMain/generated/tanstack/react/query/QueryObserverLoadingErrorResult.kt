// Automatically generated - do not modify!

package tanstack.react.query

import js.core.Void
import tanstack.query.core.False
import tanstack.query.core.QueryObserverResult
import tanstack.query.core.QueryStatus
import tanstack.query.core.True

external interface QueryObserverLoadingErrorResult<TData, TError>
    : QueryObserverResult<TData, TError> {
    override val data: Void
    override val error: TError
    override val isError: True
    override val isPending: False
    override val isLoadingError: True
    override val isRefetchError: False
    override val isSuccess: False
    override val status: QueryStatus /* 'error' */
}
