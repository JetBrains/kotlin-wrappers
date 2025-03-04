@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
)

package js.errors

import js.core.JsAny

expect open external class JsError :
    JsAny {

    constructor()
    constructor(message: String?)

    open val message: String?
}

expect fun JsError.toThrowable(): Throwable
