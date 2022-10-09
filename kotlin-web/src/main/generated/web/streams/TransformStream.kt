// Automatically generated - do not modify!

package web.streams

sealed external interface TransformStream<I, O> {
    val readable: ReadableStream<O>
    val writable: WritableStream<I>
}
