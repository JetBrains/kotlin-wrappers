// Automatically generated - do not modify!

package web.streams

import js.core.JsAny
import js.errors.JsError
import kotlin.js.definedExternally

/**
 * The **`ReadableStreamDefaultController`** interface of the Streams API represents a controller allowing control of a ReadableStream's state and internal queue.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController)
 */
external class ReadableStreamDefaultController<R : JsAny?>
private constructor() :
    ReadableStreamController<R> {
    /**
     * The **`desiredSize`** read-only property of the required to fill the stream's internal queue.
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
     * The **`enqueue()`** method of the ```js-nolint enqueue(chunk) ``` - `chunk` - : The chunk to enqueue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/enqueue)
     */
    fun enqueue(chunk: R = definedExternally)

    /**
     * The **`error()`** method of the with the associated stream to error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/error)
     */
    fun error(error: JsError = definedExternally)
}
