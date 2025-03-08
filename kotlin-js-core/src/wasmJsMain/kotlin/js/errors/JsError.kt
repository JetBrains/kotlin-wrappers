@file:Suppress(
    "INVISIBLE_MEMBER",
    "INVISIBLE_REFERENCE",
)

package js.errors

import js.reflect.unsafeCast

@JsName("Error")
actual open external class JsError :
    JsAny {

    actual constructor()
    actual constructor(message: String?)

    actual open val message: String?
}

actual fun JsError.toThrowable(): Throwable =
    JsException(this)

// TODO: check implementation
actual fun Throwable.toJsError(): JsError =
    unsafeCast(toJsReference())
