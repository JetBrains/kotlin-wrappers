// Automatically generated - do not modify!

package web.streams

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView
import js.core.Void
import js.errors.JsError
import kotlin.js.definedExternally

/**
 * The **`ReadableByteStreamController`** interface of the Streams API represents a controller for a readable byte stream. It allows control of the state and internal queue of a ReadableStream with an underlying byte source, and enables efficient zero-copy transfer of data from the underlying source to a consumer when the stream's internal queue is empty.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController)
 */
open external class ReadableByteStreamController
private constructor() :
    ReadableStreamController<Void> {
    /**
     * The **`byobRequest`** read-only property of the ReadableByteStreamController interface returns the current BYOB request, or null if there are no pending requests.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/byobRequest)
     */
    val byobRequest: ReadableStreamBYOBRequest?

    /**
     * The **`desiredSize`** read-only property of the ReadableByteStreamController interface returns the number of bytes required to fill the stream's internal queue to its "desired size".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/desiredSize)
     */
    val desiredSize: Double?

    /**
     * The **`close()`** method of the ReadableByteStreamController interface closes the associated stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/close)
     */
    fun close()

    /**
     * The **`enqueue()`** method of the ReadableByteStreamController interface enqueues a given chunk on the associated readable byte stream (the chunk is transferred into the stream's internal queues).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/enqueue)
     */
    fun enqueue(chunk: ArrayBufferView<ArrayBuffer>)

    /**
     * The **`error()`** method of the ReadableByteStreamController interface causes any future interactions with the associated stream to error with the specified reason.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/error)
     */
    fun error(error: JsError = definedExternally)
}
