// Automatically generated - do not modify!

package web.streams

import js.errors.JsError
import web.abort.AbortSignal
import web.abort.AbortableLike
import kotlin.js.definedExternally

/**
 * The **`WritableStreamDefaultController`** interface of the Streams API represents a controller allowing control of a WritableStream's state. When constructing a WritableStream, the underlying sink is given a corresponding WritableStreamDefaultController instance to manipulate.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultController)
 */
open external class WritableStreamDefaultController
private constructor() :
    AbortableLike {
    /**
     * The read-only **`signal`** property of the WritableStreamDefaultController interface returns the AbortSignal associated with the controller.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultController/signal)
     */
    override val signal: AbortSignal

    /**
     * The **`error()`** method of the WritableStreamDefaultController interface causes any future interactions with the associated stream to error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultController/error)
     */
    fun error(error: JsError = definedExternally)
}
