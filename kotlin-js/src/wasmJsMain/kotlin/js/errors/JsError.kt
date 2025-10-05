package js.errors

import js.errors.internal.createThrowable

@JsName("Error")
actual open external class JsError :
    JsAny {

    actual constructor()
    actual constructor(message: String?)

    actual open val message: String?
}

actual fun JsError.toThrowable(): Throwable =
    createThrowable(this)
