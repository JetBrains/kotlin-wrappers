// Automatically generated - do not modify!

package web.stream

import kotlin.js.Promise

sealed external interface ReadableStreamDefaultReader<R> : ReadableStreamGenericReader {
    fun read(): Promise<Any /* ReadableStreamDefaultReadResult<R> */>
    fun releaseLock()
}
