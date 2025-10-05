package js.errors

import js.errors.internal.createThrowable
import js.errors.internal.unwrapRawError

actual fun JsErrorLike?.toThrowable(): Throwable =
    createThrowable(this)

actual fun Throwable.toJsErrorLike(): JsErrorLike? {
    if (this is JsException)
        return unwrapRawError(thrownValue)

    // TODO: create JS copy as in coroutines?
    return null
}
