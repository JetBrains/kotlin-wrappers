// Automatically generated - do not modify!

package web.streams

import js.errors.JsError
import web.abort.AbortSignal

sealed external class WritableStreamDefaultController {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultController/signal) */
    val signal: AbortSignal

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultController/error) */
    fun error(error: JsError = definedExternally)
}
