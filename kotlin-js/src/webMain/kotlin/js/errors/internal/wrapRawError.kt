package js.errors.internal

import js.errors.JsError
import js.errors.JsErrorLike
import js.errors.JsErrorName
import js.errors.name
import js.reflect.Reflect
import js.reflect.unsafeCast
import kotlin.js.JsAny

private val RAW_ERROR_WRAPPER_TYPE: JsErrorName = JsErrorName("KotlinRawErrorWrapper")
private const val RAW_ERROR_WRAPPER_MESSAGE: String =
    "Kotlin raw error wrapper. Please check 'cause' for the original error"

private const val CAUSE: String = "cause"

internal fun wrapRawError(
    value: JsErrorLike?,
): JsError {
    val error = JsError(message = RAW_ERROR_WRAPPER_MESSAGE)
    error.name = RAW_ERROR_WRAPPER_TYPE
    Reflect.set(error, CAUSE, value)
    return error
}

internal fun unwrapRawError(
    value: JsAny?,
): JsErrorLike? {
    val result = if (value is JsError && value.name == RAW_ERROR_WRAPPER_TYPE) {
        Reflect.get(value, CAUSE)
    } else value

    return unsafeCast(result)
}
