// Automatically generated - do not modify!

package tanstack.react.query

import js.core.Void
import tanstack.query.core.False
import tanstack.query.core.QueryObserverResult
import tanstack.query.core.QueryStatus
import tanstack.query.core.True

external interface QueryObserverLoadingResult<TData, TError>
    : QueryObserverResult<TData, TError> {
    override val data: Void
    override val error: Void
    override val isError: False
    override val isPending: True
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: False
    override val status: QueryStatus /* 'pending' */
}
