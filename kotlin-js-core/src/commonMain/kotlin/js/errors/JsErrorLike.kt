package js.errors

import js.reflect.JsExternalInheritorsOnly
import js.reflect.upcast

@JsExternalInheritorsOnly
external interface JsErrorLike

inline fun JsErrorLike?.toJsErrorOrNull(): JsError? =
    upcast<Any?>() as? JsError

fun JsErrorLike?.toJsError(): JsError =
    toJsErrorOrNull() ?: JsError("Non-Kotlin exception $this")

expect fun JsErrorLike?.toThrowable(): Throwable

expect fun Throwable.toJsErrorLike(): JsErrorLike
