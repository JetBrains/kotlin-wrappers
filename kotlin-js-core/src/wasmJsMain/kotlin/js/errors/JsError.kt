package js.errors

import js.errors.internal.createJsException

@JsName("Error")
actual open external class JsError :
    JsAny {

    actual constructor()
    actual constructor(message: String?)

    actual open val message: String?
}

actual inline fun JsError.toThrowable(): Throwable =
    createJsException(this)
