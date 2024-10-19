// Automatically generated - do not modify!

package tanstack.query.core

// @JsPlainObject
// Details - https://youtrack.jetbrains.com/issue/KT-70664
external interface QueryObserverRefetchErrorResult<TData, TError>
    : QueryObserverResult<TData, TError> {
    override val data: TData
    override val error: TError
    override val isError: True
    override val isPending: False
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: True
    override val isSuccess: False
    override val status: QueryStatus /* 'error' */
}
