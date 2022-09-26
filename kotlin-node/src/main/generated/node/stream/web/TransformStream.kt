// Automatically generated - do not modify!

package node.stream.web

sealed external interface TransformStream<I, O> {
    val readable: ReadableStream<O>
    val writable: WritableStream<I>
}
