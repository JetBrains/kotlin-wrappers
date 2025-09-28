package js.errors

import js.errors.internal.createJsException
import js.errors.internal.unwrapRawError

actual fun JsErrorLike?.toThrowable(): Throwable =
    createJsException(this)

actual fun Throwable.toJsErrorLike(): JsErrorLike? =
    when (this) {
        is JsException -> unwrapRawError(thrownValue)
        // TODO: create JS copy as in coroutines?
        else -> null
    }
