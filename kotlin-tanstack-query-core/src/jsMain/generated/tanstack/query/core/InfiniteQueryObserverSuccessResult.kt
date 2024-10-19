// Automatically generated - do not modify!

package tanstack.query.core

import js.core.Void

// @JsPlainObject
// Details - https://youtrack.jetbrains.com/issue/KT-70664
external interface InfiniteQueryObserverSuccessResult<TData, TError>
    : InfiniteQueryObserverResult<TData, TError> {
    override val data: TData
    override val error: Void
    override val isError: False
    override val isPending: False
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: False
    override val isFetchNextPageError: False
    override val isFetchPreviousPageError: False
    override val isSuccess: True
    override val status: QueryStatus /* 'success' */
}
