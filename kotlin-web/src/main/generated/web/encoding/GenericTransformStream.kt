// Automatically generated - do not modify!

package web.encoding

import web.streams.ReadableStream
import web.streams.WritableStream

sealed external interface GenericTransformStream {
    val readable: ReadableStream<*>
    val writable: WritableStream<*>
}
