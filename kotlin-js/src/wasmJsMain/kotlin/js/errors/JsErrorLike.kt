package js.errors

import js.errors.internal.createJsException
import js.reflect.unsafeCast

actual fun JsErrorLike?.toThrowable(): Throwable =
    createJsException(this)

actual fun Throwable.toJsErrorLike(): JsErrorLike {
    val jsError = if (this is JsException) thrownValue else null
    return unsafeCast(jsError ?: toJsReference<Throwable>())
}
