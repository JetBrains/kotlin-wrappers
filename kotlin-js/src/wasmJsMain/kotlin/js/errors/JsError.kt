package js.errors

import js.errors.internal.createThrowable

@JsName("Error")
actual open external class JsError :
    JsAny {

    actual constructor()
    actual constructor(message: String?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Error/Error)
     */
    constructor(
        message: String?,
        options: ErrorOptions?,
    )

    actual open val message: String?
    actual open val cause: JsError?
}

actual fun JsError.toThrowable(): Throwable =
    createThrowable(this)
