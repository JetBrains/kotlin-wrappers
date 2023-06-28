// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package tanstack.query.core

import js.promise.Promise
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

external interface Retryer<TData> {
    var promise: Promise<TData>
    var cancel: (cancelOptions: CancelOptions?) -> Unit
    var `continue`: () -> Promise<Any?>
    var cancelRetry: () -> Unit
    var continueRetry: () -> Unit
}

typealias RetryValue<TError> = ShouldRetryFunction<TError>

typealias ShouldRetryFunction<TError> = (failureCount: Int, error: TError) -> Boolean

typealias RetryDelayValue<TError> = RetryDelayFunction<TError>

typealias RetryDelayFunction<TError> = (failureCount: Int, error: TError) -> Int

external fun canFetch(networkMode: NetworkMode?): Boolean

open external class CancelledError(options: CancelOptions = definedExternally) {
    open var revert: Boolean
    open var silent: Boolean
}

external fun isCancelledError(value: Any): Boolean /* value is CancelledError */

external fun <TData, TError> createRetryer(config: RetryerConfig<TData, TError>): Retryer<TData>
