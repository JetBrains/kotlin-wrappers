// Automatically generated - do not modify!

package web.streams

import js.buffer.ArrayBufferView
import kotlin.js.Promise

external class ReadableStreamBYOBReader(
    stream: ReadableStream<*>,
) : ReadableStreamGenericReader {
    fun <T : ArrayBufferView> read(view: T): Promise<ReadableStreamReadResult<T>>
    fun releaseLock()
}
