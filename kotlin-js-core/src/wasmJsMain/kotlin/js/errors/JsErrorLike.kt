package js.errors

import js.reflect.unsafeCast

actual fun JsErrorLike?.toThrowable(): Throwable =
    createJsException(this)

// TODO: check implementation
actual fun Throwable.toJsErrorLike(): JsErrorLike =
    unsafeCast(toJsReference())
