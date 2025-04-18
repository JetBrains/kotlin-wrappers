// Automatically generated - do not modify!

package web.streams

import js.core.JsAny
import js.promise.Promise
import seskar.js.JsAsync
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/read)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun read(): ReadableStreamReadResult<R>

    @JsName("read")
    fun readAsync(): Promise<ReadableStreamReadResult<R>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/releaseLock)
     */
    fun releaseLock()
}
