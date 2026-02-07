// Automatically generated - do not modify!

package tanstack.query.core

import js.core.Void
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface QueryObserverPlaceholderResult<TData, TError> :
    QueryObserverResult<TData, TError> {
    override val data: TData
    override val isError: False
    override val error: Void
    override val isPending: False
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: True
    override val isPlaceholderData: True
    override val status: QueryStatus /* 'success' */
}
