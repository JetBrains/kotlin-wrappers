// Automatically generated - do not modify!

package web.streams

import js.promise.Promise

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader)
 */
external class ReadableStreamDefaultReader<R>(
    stream: ReadableStream<R>,
) : ReadableStreamGenericReader {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/read)
     */
    suspend fun read(): ReadableStreamReadResult<R>

    @JsName("read")
    fun readAsync(): Promise<ReadableStreamReadResult<R>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/releaseLock)
     */
    fun releaseLock()
}
