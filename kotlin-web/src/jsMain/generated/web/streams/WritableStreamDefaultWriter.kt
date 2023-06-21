// Automatically generated - do not modify!

package web.streams

import js.core.Void
import kotlin.js.Promise

external class WritableStreamDefaultWriter<W>(
    stream: WritableStream<W>,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/closed) */
    val closed: Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/desiredSize) */
    val desiredSize: Int?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/ready) */
    val ready: Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/abort) */
    fun abort(reason: Any? = definedExternally): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/close) */
    fun close(): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/releaseLock) */
    fun releaseLock()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/write) */
    fun write(chunk: W = definedExternally): Promise<Void>
}
