// Automatically generated - do not modify!

package web.streams

import js.buffer.ArrayBufferView
import js.errors.JsError

sealed external class ReadableByteStreamController {
    val byobRequest: ReadableStreamBYOBRequest?
    val desiredSize: Int?
    fun close()
    fun enqueue(chunk: ArrayBufferView)
    fun error(error: JsError = definedExternally)
}
