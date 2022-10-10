// Automatically generated - do not modify!

package web.streams

import kotlin.js.Promise

sealed external interface ReadableStreamDefaultReader<R> : ReadableStreamGenericReader {
    fun read(): Promise<Any /* ReadableStreamDefaultReadResult<R> */>
    fun releaseLock()
}
