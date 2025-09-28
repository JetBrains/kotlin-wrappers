package js.errors.internal

import js.errors.JsError
import js.errors.JsErrorLike
import js.errors.JsErrorName
import js.errors.name
import js.reflect.Reflect
import js.reflect.unsafeCast
import js.symbol.Symbol

private val RAW_ERROR_WRAPPER: JsErrorName = JsErrorName("@@kotlin-raw-error-wrapper@@")
private val ORIGINAL_ERROR_KEY: Symbol = Symbol("@@original-error")

internal fun wrap(
    value: JsErrorLike?,
): JsError {
    val error = JsError()
    error.name = RAW_ERROR_WRAPPER
    Reflect.set(error, ORIGINAL_ERROR_KEY, value)
    return error
}

internal fun unwrap(
    value: JsError,
): JsErrorLike? {
    val result = if (value.name == RAW_ERROR_WRAPPER) {
        Reflect.get(value, ORIGINAL_ERROR_KEY)
    } else value

    return unsafeCast(result)
}
