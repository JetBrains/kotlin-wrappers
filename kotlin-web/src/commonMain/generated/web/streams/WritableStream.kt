// Automatically generated - do not modify!

package web.streams

import js.core.JsAny
import js.core.Void
import js.errors.JsError
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import js.serialization.Transferable
import seskar.js.JsAsync
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`WritableStream`** interface of the Streams API provides a standard abstraction for writing streaming data to a destination, known as a sink.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream)
 */
open external class WritableStream<W : JsAny?>(
    underlyingSink: UnderlyingSink<W> = definedExternally,
    strategy: QueuingStrategy<W> = definedExternally,
) : Transferable {
    /**
     * The **`locked`** read-only property of the WritableStream interface returns a boolean indicating whether the `WritableStream` is locked to a writer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/locked)
     */
    val locked: Boolean

    /**
     * The **`abort()`** method of the WritableStream interface aborts the stream, signaling that the producer can no longer successfully write to the stream and it is to be immediately moved to an error state, with any queued writes discarded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/abort)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun abort(reason: JsError? = definedExternally)

    @JsName("abort")
    fun abortAsync(reason: JsError? = definedExternally): Promise<Void>

    /**
     * The **`close()`** method of the WritableStream interface closes the associated stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/close)
     */
    @JsName("close")
    fun closeAsync(): Promise<Void>

    /**
     * The **`getWriter()`** method of the WritableStream interface returns a new instance of WritableStreamDefaultWriter and locks the stream to that instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/getWriter)
     */
    fun getWriter(): WritableStreamDefaultWriter<W>
}

/**
 * The **`close()`** method of the WritableStream interface closes the associated stream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/close)
 */
suspend inline fun <W : JsAny?> WritableStream<W>.close() {
    awaitPromiseLike(closeAsync())
}
