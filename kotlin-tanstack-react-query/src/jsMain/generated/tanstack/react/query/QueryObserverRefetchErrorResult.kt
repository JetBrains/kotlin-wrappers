// Automatically generated - do not modify!

package tanstack.react.query

import tanstack.query.core.False
import tanstack.query.core.QueryObserverResult
import tanstack.query.core.QueryStatus
import tanstack.query.core.True

external interface QueryObserverRefetchErrorResult<TData, TError>
    : QueryObserverResult<TData, TError> {
    override val data: TData
    override val error: TError
    override val isError: True
    override val isPending: False
    override val isLoadingError: False
    override val isRefetchError: True
    override val isSuccess: False
    override val status: QueryStatus /* 'error' */
}
