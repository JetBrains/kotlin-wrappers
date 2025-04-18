// Automatically generated - do not modify!

package web.streams

import js.errors.JsError
import web.abort.AbortSignal
import kotlin.js.definedExternally

/**
 * The **`WritableStreamDefaultController`** interface of the Streams API represents a controller allowing control of a WritableStream's state.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultController)
 */
external class WritableStreamDefaultController
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultController/signal)
     */
    val signal: AbortSignal

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultController/error)
     */
    fun error(error: JsError = definedExternally)
}
