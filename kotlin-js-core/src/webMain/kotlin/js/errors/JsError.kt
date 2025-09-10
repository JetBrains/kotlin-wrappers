@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
)

package js.errors

import kotlin.js.JsAny

expect open external class JsError :
    JsAny {

    constructor()
    constructor(message: String?)

    open val message: String?
}

expect fun JsError.toThrowable(): Throwable
