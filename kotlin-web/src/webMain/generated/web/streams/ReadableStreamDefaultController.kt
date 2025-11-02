// Automatically generated - do not modify!

package web.streams

import js.errors.JsError
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The **`ReadableStreamDefaultController`** interface of the Streams API represents a controller allowing control of a ReadableStream's state and internal queue. Default controllers are for streams that are not byte streams.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController)
 */
open external class ReadableStreamDefaultController<R : JsAny?>
private constructor() :
    ReadableStreamController<R> {
    /**
     * The **`desiredSize`** read-only property of the ReadableStreamDefaultController interface returns the desired size required to fill the stream's internal queue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/desiredSize)
     */
    val desiredSize: Double?

    /**
     * The **`close()`** method of the ReadableStreamDefaultController interface closes the associated stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/close)
     */
    fun close()

    /**
     * The **`enqueue()`** method of the ReadableStreamDefaultController interface enqueues a given chunk in the associated stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/enqueue)
     */
    fun enqueue(chunk: R = definedExternally)

    /**
     * The **`error()`** method of the ReadableStreamDefaultController interface causes any future interactions with the associated stream to error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/error)
     */
    fun error(error: JsError = definedExternally)
}
