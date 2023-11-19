// Automatically generated - do not modify!

package tanstack.query.core

import js.core.Void

external interface InfiniteQueryObserverSuccessResult<TData, TError>
    : InfiniteQueryObserverResult<TData, TError> {
    override val data: InfiniteData<TData>
    override val error: Void
    override val isError: False
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: False
    override val isSuccess: True
    override val status: QueryStatus /* 'success' */
}
