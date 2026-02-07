// Automatically generated - do not modify!

package tanstack.query.core

import js.core.Void
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface QueryObserverPendingResult<TData, TError> :
    QueryObserverResult<TData, TError> {
    override val data: Void
    override val error: Void
    override val isError: False
    override val isPending: True
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: False
    override val isPlaceholderData: False
    override val status: QueryStatus /* 'pending' */
}
