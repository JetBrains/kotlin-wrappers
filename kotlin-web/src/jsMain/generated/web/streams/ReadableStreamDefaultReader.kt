// Automatically generated - do not modify!

package web.streams

import kotlin.js.Promise

external class ReadableStreamDefaultReader<R>(
    stream: ReadableStream<R>,
) : ReadableStreamGenericReader {
    fun read(): Promise<ReadableStreamReadResult<R>>
    fun releaseLock()
}
