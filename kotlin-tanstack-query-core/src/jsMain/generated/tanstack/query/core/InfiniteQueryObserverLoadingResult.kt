// Automatically generated - do not modify!

package tanstack.query.core

import js.core.Void

// @JsPlainObject
// Details - https://youtrack.jetbrains.com/issue/KT-70664
external interface InfiniteQueryObserverLoadingResult<TData, TError>
    : InfiniteQueryObserverResult<TData, TError> {
    override val data: Void
    override val error: Void
    override val isError: False
    override val isPending: True
    override val isLoading: True
    override val isLoadingError: False
    override val isRefetchError: False
    override val isFetchNextPageError: False
    override val isFetchPreviousPageError: False
    override val isSuccess: False
    override val isPlaceholderData: False
    override val status: QueryStatus /* 'pending' */
}
