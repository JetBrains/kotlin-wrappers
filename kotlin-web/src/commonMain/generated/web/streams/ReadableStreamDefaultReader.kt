// Automatically generated - do not modify!

package web.streams

import js.core.JsAny
import js.promise.Promise
import js.promise.await
import kotlin.js.JsName

/**
 * The **`ReadableStreamDefaultReader`** interface of the Streams API represents a default reader that can be used to read stream data supplied from a network (such as a fetch request).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader)
 */
open external class ReadableStreamDefaultReader<R : JsAny?>(
    stream: ReadableStream<R>,
) : ReadableStreamGenericReader {
    /**
     * The **`read()`** method of the ReadableStreamDefaultReader interface returns a Promise providing access to the next chunk in the stream's internal queue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/read)
     */
    @JsName("read")
    fun readAsync(): Promise<ReadableStreamReadResult<R>>

    /**
     * The **`releaseLock()`** method of the ReadableStreamDefaultReader interface releases the reader's lock on the stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/releaseLock)
     */
    fun releaseLock()
}

/**
 * The **`read()`** method of the ReadableStreamDefaultReader interface returns a Promise providing access to the next chunk in the stream's internal queue.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/read)
 */
suspend inline fun <R : JsAny?> ReadableStreamDefaultReader<R>.read(): ReadableStreamReadResult<R> {
    return readAsync().await()
}
