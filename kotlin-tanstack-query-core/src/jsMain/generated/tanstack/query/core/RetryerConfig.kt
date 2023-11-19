// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.PromiseResult

external interface RetryerConfig<TData, TError> {
    var fn: () -> PromiseResult<TData>
    var abort: () -> Unit
    var onError: (error: TError) -> Unit
    var onSuccess: (data: TData) -> Unit
    var onFail: (failureCount: Int, error: TError) -> Unit
    var onPause: () -> Unit
    var onContinue: () -> Unit
    var retry: RetryValue<TError>
    var retryDelay: RetryDelayValue<TError>
    var networkMode: NetworkMode?
}
