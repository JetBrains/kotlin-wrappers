// Automatically generated - do not modify!

package web.streams

import js.core.Void
import kotlin.js.Promise

open external class WritableStream<W>(
    underlyingSink: UnderlyingSink<W> = definedExternally,
    strategy: QueuingStrategy<W> = definedExternally,
) {
    val locked: Boolean
    fun abort(reason: Any? = definedExternally): Promise<Void>
    fun close(): Promise<Void>
    fun getWriter(): WritableStreamDefaultWriter<W>
}
