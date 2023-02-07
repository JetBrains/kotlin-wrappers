// Automatically generated - do not modify!

package web.streams

import js.buffer.ArrayBufferView
import js.core.Void

sealed external interface ReadableByteStreamController {
    val byobRequest: Void
    val desiredSize: Number?
    fun close()
    fun enqueue(chunk: ArrayBufferView)
    fun error(error: Any = definedExternally)
}
