package js.errors

import js.core.JsAny
import js.core.JsAnyMarker
import js.reflect.upcast

sealed external interface JsErrorLike :
    JsAnyMarker

inline fun JsErrorLike?.toJsErrorOrNull(): JsError? =
    upcast<JsAny?>() as? JsError

fun JsErrorLike?.toJsError(): JsError =
    toJsErrorOrNull() ?: JsError("Non-Kotlin exception $this")

expect fun JsErrorLike?.toThrowable(): Throwable

expect fun Throwable.toJsErrorLike(): JsErrorLike
