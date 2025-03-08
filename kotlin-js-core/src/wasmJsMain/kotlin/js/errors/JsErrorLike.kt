@file:Suppress(
    "INVISIBLE_MEMBER",
    "INVISIBLE_REFERENCE",
)

package js.errors

import js.reflect.unsafeCast

actual fun JsErrorLike?.toThrowable(): Throwable =
    JsException(this)

// TODO: check implementation
actual fun Throwable.toJsErrorLike(): JsErrorLike =
    unsafeCast(toJsReference())
