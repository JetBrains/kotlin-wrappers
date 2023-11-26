// Automatically generated - do not modify!

package tanstack.react.query

import js.core.Void
import tanstack.query.core.False
import tanstack.query.core.QueryObserverResult
import tanstack.query.core.QueryStatus
import tanstack.query.core.True

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
