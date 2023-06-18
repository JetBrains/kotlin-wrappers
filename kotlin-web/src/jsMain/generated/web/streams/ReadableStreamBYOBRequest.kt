// Automatically generated - do not modify!

package web.streams

import js.buffer.ArrayBufferView

sealed external class ReadableStreamBYOBRequest {
    val view: ArrayBufferView?
    fun respond(bytesWritten: Number)
    fun respondWithNewView(view: ArrayBufferView)
}
