// Automatically generated - do not modify!

package web.streams

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView
import js.promise.Promise
import js.typedarrays.Uint8Array
import seskar.js.JsAsync
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/read)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun <T : ArrayBufferView<*>> read(view: T): ReadableStreamReadResult<T>

    @JsName("read")
    fun <T : ArrayBufferView<*>> readAsync(view: T): Promise<ReadableStreamReadResult<T>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/releaseLock)
     */
    fun releaseLock()
}
