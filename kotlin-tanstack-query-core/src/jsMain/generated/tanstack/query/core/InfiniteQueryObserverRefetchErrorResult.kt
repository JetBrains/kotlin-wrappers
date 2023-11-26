// Automatically generated - do not modify!

package tanstack.query.core

external interface InfiniteQueryObserverRefetchErrorResult<TData, TError>
    : InfiniteQueryObserverResult<TData, TError> {
    override val data: TData
    override val error: TError
    override val isError: True
    override val isPending: False
    override val isLoadingError: False
    override val isRefetchError: True
    override val isSuccess: False
    override val status: QueryStatus /* 'error' */
}
