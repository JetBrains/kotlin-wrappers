// Automatically generated - do not modify!

package web.streams

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView
import js.promise.Promise
import js.promise.await
import js.typedarrays.Uint8Array
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The `ReadableStreamBYOBReader` interface of the Streams API defines a reader for a ReadableStream that supports zero-copy reading from an underlying byte source.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader)
 */
open external class ReadableStreamBYOBReader(
    stream: ReadableStream<Uint8Array<ArrayBuffer>>,
) : ReadableStreamGenericReader {
    /**
     * The **`read()`** method of the ReadableStreamBYOBReader interface is used to read data into a view on a user-supplied buffer from an associated readable byte stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/read)
     */
    @JsName("read")
    fun <T : ArrayBufferView<ArrayBuffer> /* Exclude<BufferSource, ArrayBuffer> */> readAsync(
        view: T,
        options: ReadableStreamBYOBReaderReadOptions = definedExternally,
    ): Promise<ReadableStreamReadResult<T>>

    /**
     * The **`releaseLock()`** method of the ReadableStreamBYOBReader interface releases the reader's lock on the stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/releaseLock)
     */
    fun releaseLock()
}

/**
 * The **`read()`** method of the ReadableStreamBYOBReader interface is used to read data into a view on a user-supplied buffer from an associated readable byte stream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/read)
 */
suspend inline fun <T : ArrayBufferView<ArrayBuffer> /* Exclude<BufferSource, ArrayBuffer> */> ReadableStreamBYOBReader.read(
    view: T,
): ReadableStreamReadResult<T> {
    return readAsync(
        view = view,
    ).await()
}

/**
 * The **`read()`** method of the ReadableStreamBYOBReader interface is used to read data into a view on a user-supplied buffer from an associated readable byte stream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/read)
 */
suspend inline fun <T : ArrayBufferView<ArrayBuffer> /* Exclude<BufferSource, ArrayBuffer> */> ReadableStreamBYOBReader.read(
    view: T,
    options: ReadableStreamBYOBReaderReadOptions,
): ReadableStreamReadResult<T> {
    return readAsync(
        view = view,
        options = options,
    ).await()
}
