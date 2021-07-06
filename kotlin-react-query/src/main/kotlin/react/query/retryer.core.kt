// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.query

external interface RetryerConfig<TData, TError> {
    var fn: () -> dynamic
    var onError: (error: TError) -> Unit
    var onSuccess: (data: TData) -> Unit
    var onFail: (failureCount: Number, error: TError) -> Unit
    var onPause: () -> Unit
    var onContinue: () -> Unit
    var retry: RetryValue<TError>
    var retryDelay: RetryDelayValue<TError>
}

typealias RetryValue<TError> = Union /* boolean | number | ShouldRetryFunction<TError> */

typealias ShouldRetryFunction<TError> = (failureCount: Number, error: TError) -> Boolean

typealias RetryDelayValue<TError> = Union /* number | RetryDelayFunction<TError> */

typealias RetryDelayFunction<TError> = (failureCount: Number, error: TError) -> Number

external interface Cancelable {
    fun cancel()
}

external fun isCancelable(value: Any): Boolean /* value is Cancelable */

external interface CancelOptions {
    var revert: Boolean
    var silent: Boolean
}

open external class CancelledError(options: CancelOptions = definedExternally) {
    open var revert: Boolean
    open var silent: Boolean
}

external fun isCancelledError(value: Any): Boolean /* value is CancelledError */

open external class Retryer<TData, TError>(config: RetryerConfig<TData, TError>) {
    open var cancel: (options: CancelOptions?) -> Unit
    open var cancelRetry: () -> Unit
    open var `continue`: () -> Unit
    open var failureCount: Number
    open var isPaused: Boolean
    open var isResolved: Boolean
    open var isTransportCancelable: Boolean
    open var promise: kotlin.js.Promise<TData>
}
