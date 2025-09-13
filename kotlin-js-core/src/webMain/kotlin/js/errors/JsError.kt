@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
)

package js.errors

import kotlin.js.JsAny

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error)
 */
expect open external class JsError :
    JsAny {

    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error/Error)
     */
    constructor()

    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error/Error)
     */
    constructor(message: String?)

    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error/message)
     */
    open val message: String?
}

expect fun JsError.toThrowable(): Throwable
