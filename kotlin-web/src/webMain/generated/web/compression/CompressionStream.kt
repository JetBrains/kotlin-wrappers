// Automatically generated - do not modify!

package web.compression

import js.buffer.ArrayBuffer
import js.buffer.BufferSource
import js.typedarrays.Uint8Array
import web.streams.GenericTransformStream
import web.streams.ReadableStream
import web.streams.WritableStream

/**
 * The **`CompressionStream`** interface of the Compression Streams API compresses a stream of data. It implements the same shape as a TransformStream, allowing it to be used in ReadableStream.pipeThrough() and similar methods.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompressionStream)
 */
open external class CompressionStream(
    format: CompressionFormat,
) : GenericTransformStream {
    /**
     * The **`readable`** read-only property of the CompressionStream interface returns a ReadableStream that emits compressed data as Uint8Array chunks.
     */
    override val readable: ReadableStream<Uint8Array<ArrayBuffer>>

    /**
     * The **`writable`** read-only property of the CompressionStream interface returns a WritableStream that accepts uncompressed data to be compressed, in the form of ArrayBuffer, TypedArray, or DataView chunks.
     */
    override val writable: WritableStream<BufferSource>
}
