// Automatically generated - do not modify!

package web.streams

import js.core.JsAny
import js.core.Void
import js.errors.JsError
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import seskar.js.JsAsync
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`WritableStreamDefaultWriter`** interface of the Streams API is the object returned by WritableStream.getWriter() and once created locks the writer to the `WritableStream` ensuring that no other streams can write to the underlying sink.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter)
 */
open external class WritableStreamDefaultWriter<W : JsAny?>(
    stream: WritableStream<W>,
) {
    /**
     * The **`closed`** read-only property of the the stream errors or the writer's lock is released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/closed)
     */
    val closed: Promise<Void>

    /**
     * The **`desiredSize`** read-only property of the to fill the stream's internal queue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/desiredSize)
     */
    val desiredSize: Double?

    /**
     * The **`ready`** read-only property of the that resolves when the desired size of the stream's internal queue transitions from non-positive to positive, signaling that it is no longer applying backpressure.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/ready)
     */
    val ready: Promise<Void>

    /**
     * The **`abort()`** method of the the producer can no longer successfully write to the stream and it is to be immediately moved to an error state, with any queued writes discarded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/abort)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun abort(reason: JsError? = definedExternally)

    @JsName("abort")
    fun abortAsync(reason: JsError? = definedExternally): Promise<Void>

    /**
     * The **`close()`** method of the stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/close)
     */
    @JsName("close")
    fun closeAsync(): Promise<Void>

    /**
     * The **`releaseLock()`** method of the corresponding stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/releaseLock)
     */
    fun releaseLock()

    /**
     * The **`write()`** method of the operation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/write)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun write(chunk: W = definedExternally)

    @JsName("write")
    fun writeAsync(chunk: W = definedExternally): Promise<Void>
}

/**
 * The **`close()`** method of the stream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/close)
 */
suspend inline fun <W : JsAny?> WritableStreamDefaultWriter<W>.close() {
    awaitPromiseLike(closeAsync())
}
