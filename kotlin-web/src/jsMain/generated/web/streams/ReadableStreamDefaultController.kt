// Automatically generated - do not modify!

package web.streams

import js.errors.JsError

sealed external class ReadableStreamDefaultController<R> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/desiredSize) */
    val desiredSize: Int?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/close) */
    fun close()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/enqueue) */
    fun enqueue(chunk: R = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/error) */
    fun error(error: JsError = definedExternally)
}
