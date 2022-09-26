// Automatically generated - do not modify!

package node.stream.web

import kotlinx.js.ArrayBufferView
import kotlinx.js.Void

sealed external interface ReadableByteStreamController {
    val byobRequest: Void
    val desiredSize: Number?
    fun close()
    fun enqueue(chunk: ArrayBufferView)
    fun error(error: Any = definedExternally)
}
