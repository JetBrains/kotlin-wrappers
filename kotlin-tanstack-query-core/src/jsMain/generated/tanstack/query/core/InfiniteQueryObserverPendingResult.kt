// Automatically generated - do not modify!

package tanstack.query.core

import js.core.Void

external interface InfiniteQueryObserverPendingResult<TData, TError>
    : InfiniteQueryObserverResult<TData, TError> {
    override val data: Void
    override val error: Void
    override val isError: False
    override val isPending: True
    override val isLoadingError: False
    override val isRefetchError: False
    override val isFetchNextPageError: False
    override val isFetchPreviousPageError: False
    override val isSuccess: False
    override val status: QueryStatus /* 'pending' */
}
