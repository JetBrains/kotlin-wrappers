// Automatically generated - do not modify!

package web.streams

import js.buffer.ArrayBufferView
import js.core.JsLong

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBRequest)
 */
external class ReadableStreamBYOBRequest
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBRequest/view)
     */
    val view: ArrayBufferView?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBRequest/respond)
     */
    fun respond(bytesWritten: JsLong)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBRequest/respondWithNewView)
     */
    fun respondWithNewView(view: ArrayBufferView)
}
