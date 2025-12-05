// Automatically generated - do not modify!

package web.compression

import js.buffer.ArrayBuffer
import js.buffer.BufferSource
import js.typedarrays.Uint8Array
import web.streams.GenericTransformStream
import web.streams.ReadableStream
import web.streams.WritableStream

/**
 * The **`DecompressionStream`** interface of the Compression Streams API decompresses a stream of data. It implements the same shape as a TransformStream, allowing it to be used in ReadableStream.pipeThrough() and similar methods.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DecompressionStream)
 */
open external class DecompressionStream(
    format: CompressionFormat,
) : GenericTransformStream {
    /**
     * The **`readable`** read-only property of the DecompressionStream interface returns a ReadableStream that emits decompressed data as Uint8Array chunks.
     */
    override val readable: ReadableStream<Uint8Array<ArrayBuffer>>

    /**
     * The **`writable`** read-only property of the DecompressionStream interface returns a WritableStream that accepts compressed data to be decompressed, in the form of ArrayBuffer, TypedArray, or DataView chunks.
     */
    override val writable: WritableStream<BufferSource>
}
