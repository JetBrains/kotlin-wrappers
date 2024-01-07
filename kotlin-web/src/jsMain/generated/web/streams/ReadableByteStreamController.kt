// Automatically generated - do not modify!

package web.streams

import js.buffer.ArrayBufferView
import js.core.Void
import js.errors.JsError

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController)
 */
sealed external class ReadableByteStreamController :
    ReadableStreamController<Void> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/byobRequest)
     */
    val byobRequest: ReadableStreamBYOBRequest?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/desiredSize)
     */
    val desiredSize: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/close)
     */
    fun close()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/enqueue)
     */
    fun enqueue(chunk: ArrayBufferView)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/error)
     */
    fun error(error: JsError = definedExternally)
}
