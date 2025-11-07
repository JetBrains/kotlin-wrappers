// Automatically generated - do not modify!

package web.compression

import js.buffer.ArrayBuffer
import js.buffer.BufferSource
import js.typedarrays.Uint8Array
import web.streams.GenericTransformStream
import web.streams.ReadableStream
import web.streams.WritableStream

/**
 * The **`CompressionStream`** interface of the Compression Streams API is an API for compressing a stream of data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompressionStream)
 */
open external class CompressionStream(
    format: CompressionFormat,
) : GenericTransformStream {
    /**
     * The **`readable`** read-only property of the CompressionStream interface returns a ReadableStream.
     */
    override val readable: ReadableStream<Uint8Array<ArrayBuffer>>

    /**
     * The **`writable`** read-only property of the CompressionStream interface returns a WritableStream.
     */
    override val writable: WritableStream<BufferSource>
}
