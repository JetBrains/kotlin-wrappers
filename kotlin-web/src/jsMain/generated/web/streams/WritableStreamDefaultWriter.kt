// Automatically generated - do not modify!

package web.streams

import js.core.Void
import kotlin.js.Promise

external class WritableStreamDefaultWriter<W>(
    stream: WritableStream<W>,
) {
    val closed: Promise<Void>
    val desiredSize: Int?
    val ready: Promise<Void>
    fun abort(reason: Any? = definedExternally): Promise<Void>
    fun close(): Promise<Void>
    fun releaseLock()
    fun write(chunk: W = definedExternally): Promise<Void>
}
