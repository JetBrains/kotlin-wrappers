// Automatically generated - do not modify!

package web.streams

import js.core.Void
import js.errors.JsError
import js.promise.Promise
import js.promise.await
import kotlin.js.JsAny
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
     * The **`closed`** read-only property of the WritableStreamDefaultWriter interface returns a Promise that fulfills if the stream becomes closed, or rejects if the stream errors or the writer's lock is released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/closed)
     */
    val closed: Promise<Void>

    /**
     * The **`desiredSize`** read-only property of the WritableStreamDefaultWriter interface returns the desired size required to fill the stream's internal queue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/desiredSize)
     */
    val desiredSize: Double?

    /**
     * The **`ready`** read-only property of the WritableStreamDefaultWriter interface returns a Promise that resolves when the desired size of the stream's internal queue transitions from non-positive to positive, signaling that it is no longer applying backpressure.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/ready)
     */
    val ready: Promise<Void>

    /**
     * The **`abort()`** method of the WritableStreamDefaultWriter interface aborts the stream, signaling that the producer can no longer successfully write to the stream and it is to be immediately moved to an error state, with any queued writes discarded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/abort)
     */
    @JsName("abort")
    fun abortAsync(reason: JsError? = definedExternally): Promise<Void>

    /**
     * The **`close()`** method of the WritableStreamDefaultWriter interface closes the associated writable stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/close)
     */
    @JsName("close")
    fun closeAsync(): Promise<Void>

    /**
     * The **`releaseLock()`** method of the WritableStreamDefaultWriter interface releases the writer's lock on the corresponding stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/releaseLock)
     */
    fun releaseLock()

    /**
     * The **`write()`** method of the WritableStreamDefaultWriter interface writes a passed chunk of data to a WritableStream and its underlying sink, then returns a Promise that resolves to indicate the success or failure of the write operation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/write)
     */
    @JsName("write")
    fun writeAsync(chunk: W = definedExternally): Promise<Void>
}

/**
 * The **`abort()`** method of the WritableStreamDefaultWriter interface aborts the stream, signaling that the producer can no longer successfully write to the stream and it is to be immediately moved to an error state, with any queued writes discarded.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/abort)
 */
suspend inline fun <W : JsAny?> WritableStreamDefaultWriter<W>.abort(reason: JsError?) {
    abortAsync(
        reason = reason,
    ).await()
}

/**
 * The **`abort()`** method of the WritableStreamDefaultWriter interface aborts the stream, signaling that the producer can no longer successfully write to the stream and it is to be immediately moved to an error state, with any queued writes discarded.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/abort)
 */
suspend inline fun <W : JsAny?> WritableStreamDefaultWriter<W>.abort() {
    abortAsync().await()
}

/**
 * The **`close()`** method of the WritableStreamDefaultWriter interface closes the associated writable stream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/close)
 */
suspend inline fun <W : JsAny?> WritableStreamDefaultWriter<W>.close() {
    closeAsync().await()
}

/**
 * The **`write()`** method of the WritableStreamDefaultWriter interface writes a passed chunk of data to a WritableStream and its underlying sink, then returns a Promise that resolves to indicate the success or failure of the write operation.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/write)
 */
suspend inline fun <W : JsAny?> WritableStreamDefaultWriter<W>.write(chunk: W) {
    writeAsync(
        chunk = chunk,
    ).await()
}

/**
 * The **`write()`** method of the WritableStreamDefaultWriter interface writes a passed chunk of data to a WritableStream and its underlying sink, then returns a Promise that resolves to indicate the success or failure of the write operation.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/write)
 */
suspend inline fun <W : JsAny?> WritableStreamDefaultWriter<W>.write() {
    writeAsync().await()
}
