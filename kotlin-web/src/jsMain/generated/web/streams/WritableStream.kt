// Automatically generated - do not modify!

package web.streams

import js.core.Void
import kotlin.js.Promise

open external class WritableStream<W>(
    underlyingSink: UnderlyingSink<W> = definedExternally,
    strategy: QueuingStrategy<W> = definedExternally,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/locked) */
    val locked: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/abort) */
    fun abort(reason: Any? = definedExternally): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/close) */
    fun close(): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/getWriter) */
    fun getWriter(): WritableStreamDefaultWriter<W>
}
