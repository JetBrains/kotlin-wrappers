package js.errors

import js.reflect.unsafeCast

actual inline fun JsErrorLike?.toThrowable(): Throwable =
    toJsError()

actual fun Throwable.toJsErrorLike(): JsErrorLike? =
    unsafeCast(this)
