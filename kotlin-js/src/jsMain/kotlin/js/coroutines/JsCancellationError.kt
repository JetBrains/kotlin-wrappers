package js.coroutines

import js.errors.JsError
import js.errors.JsErrorName
import js.errors.name

internal val JS_CANCELLATION_ERROR: JsErrorName = JsErrorName("CancellationError")

internal fun JsCancellationError(): JsError {
    val error = JsError()
    error.name = JS_CANCELLATION_ERROR
    return error
}
