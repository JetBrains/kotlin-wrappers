// Automatically generated - do not modify!

package web.streams

sealed external interface GenericTransformStream {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompressionStream/readable)
     */
    val readable: ReadableStream<*>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompressionStream/writable)
     */
    val writable: WritableStream<*>
}
