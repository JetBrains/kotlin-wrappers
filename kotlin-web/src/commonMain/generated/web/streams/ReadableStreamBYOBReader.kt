// Automatically generated - do not modify!

package web.streams

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import js.typedarrays.Uint8Array
import kotlin.js.JsName

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
    fun <T : ArrayBufferView<*>> readAsync(view: T): Promise<ReadableStreamReadResult<T>>

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
suspend inline fun <T : ArrayBufferView<*>> ReadableStreamBYOBReader.read(view: T): ReadableStreamReadResult<T> {
    return awaitPromiseLike(readAsync(view))
}
