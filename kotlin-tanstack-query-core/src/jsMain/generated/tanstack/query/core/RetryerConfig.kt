// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject
import js.promise.Promise
import js.promise.PromiseResult

@JsPlainObject
external interface RetryerConfig<TData, TError> {
    val fn: () -> PromiseResult<TData>
    val initialPromise: Promise<TData>?
    val onCancel: ((error: TError) -> Unit)?
    val onFail: ((failureCount: Int, error: TError) -> Unit)?
    val onPause: (() -> Unit)?
    val onContinue: (() -> Unit)?
    val retry: RetryValue<TError>?
    val retryDelay: RetryDelayValue<TError>?
    val networkMode: NetworkMode?
    val canRun: () -> Boolean
}
