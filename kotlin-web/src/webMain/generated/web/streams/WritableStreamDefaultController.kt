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
open external class WritableStreamDefaultController
private constructor() {
    /**
     * The read-only **`signal`** property of the WritableStreamDefaultController interface returns the AbortSignal associated with the controller.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultController/signal)
     */
    val signal: AbortSignal

    /**
     * The **`error()`** method of the WritableStreamDefaultController interface causes any future interactions with the associated stream to error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultController/error)
     */
    fun error(error: JsError = definedExternally)
}
