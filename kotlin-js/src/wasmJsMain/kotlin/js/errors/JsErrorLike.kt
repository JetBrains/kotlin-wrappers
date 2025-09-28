package js.errors

import js.errors.internal.createJsException
import js.reflect.unsafeCast

actual fun JsErrorLike?.toThrowable(): Throwable =
    createJsException(this)

actual fun Throwable.toJsErrorLike(): JsErrorLike? =
    when (this) {
        is JsException -> unsafeCast(thrownValue)
        // TODO: create JS copy as in coroutines?
        else -> null
    }
