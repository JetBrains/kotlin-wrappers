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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/desiredSize)
     */
    val desiredSize: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/close)
     */
    fun close()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/enqueue)
     */
    fun enqueue(chunk: R = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/error)
     */
    fun error(error: JsError = definedExternally)
}
