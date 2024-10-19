// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.Promise
import js.promise.PromiseResult
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface RetryerConfig<TData, TError> {
    val fn: () -> PromiseResult<TData>
    val initialPromise: Promise<TData>?
    val abort: (() -> Unit)?
    val onError: ((error: TError) -> Unit)?
    val onSuccess: ((data: TData) -> Unit)?
    val onFail: ((failureCount: Int, error: TError) -> Unit)?
    val onPause: (() -> Unit)?
    val onContinue: (() -> Unit)?
    val retry: RetryValue<TError>?
    val retryDelay: RetryDelayValue<TError>?
    val networkMode: NetworkMode?
    val canRun: () -> Boolean
}
