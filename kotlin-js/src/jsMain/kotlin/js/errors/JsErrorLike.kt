package js.errors

import js.errors.internal.unwrapRawError

actual inline fun JsErrorLike?.toThrowable(): Throwable =
    toJsError()

actual fun Throwable.toJsErrorLike(): JsErrorLike? =
    unwrapRawError(this)
