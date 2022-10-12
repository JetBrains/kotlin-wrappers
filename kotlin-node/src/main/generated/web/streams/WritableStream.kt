// Automatically generated - do not modify!

package web.streams

import kotlinx.js.Void
import kotlin.js.Promise

external interface WritableStream<W> {
    val locked: Boolean
    fun abort(reason: Any = definedExternally): Promise<Void>
    fun close(): Promise<Void>
    fun getWriter(): WritableStreamDefaultWriter<W>
}
