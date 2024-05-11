// Automatically generated - do not modify!

package web.streams

import js.core.Void
import js.errors.JsError
import js.promise.Promise
import js.transferable.Transferable
import seskar.js.JsAsync

/**
 * This Streams API interface provides a standard abstraction for writing streaming data to a destination, known as a sink. This object comes with built-in backpressure and queuing.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream)
 */
open external class WritableStream<W>(
    underlyingSink: UnderlyingSink<W> = definedExternally,
    strategy: QueuingStrategy<W> = definedExternally,
) : Transferable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/locked)
     */
    val locked: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/abort)
     */
    @JsAsync
    suspend fun abort(reason: JsError = definedExternally)

    @JsName("abort")
    fun abortAsync(reason: JsError = definedExternally): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/close)
     */
    @JsAsync
    suspend fun close()

    @JsName("close")
    fun closeAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/getWriter)
     */
    fun getWriter(): WritableStreamDefaultWriter<W>
}
