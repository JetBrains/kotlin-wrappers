package js.coroutines

import js.errors.JsErrorName
import js.errors.name
import kotlinx.coroutines.CancellationException

internal val JS_CANCELLATION_ERROR: JsErrorName = JsErrorName("CancellationError")

internal class JsCancellationError :
    CancellationException() {
    init {
        name = JS_CANCELLATION_ERROR
    }
}
