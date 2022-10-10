// Automatically generated - do not modify!

package web.streams

import kotlinx.js.Void
import kotlin.js.Promise

sealed external interface WritableStreamDefaultWriter<W> {
    val closed: Promise<Void>
    val desiredSize: Number?
    val ready: Promise<Void>
    fun abort(reason: Any = definedExternally): Promise<Void>
    fun close(): Promise<Void>
    fun releaseLock()
    fun write(chunk: W = definedExternally): Promise<Void>
}
