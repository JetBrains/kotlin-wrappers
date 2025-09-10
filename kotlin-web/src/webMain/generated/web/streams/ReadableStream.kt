// Automatically generated - do not modify!

package web.streams

import js.array.Tuple2
import js.core.Void
import js.disposable.internal.AsyncCloseableDisposable
import js.errors.JsError
import js.iterable.AsyncIterable
import js.iterable.AsyncIterator
import js.promise.Promise
import js.promise.await
import js.serialization.Transferable
import web.abort.AbortController
import web.abort.internal.awaitCancellable
import web.abort.internal.createAbortable
import web.abort.internal.patchAbortOptions
import kotlin.js.JsAny
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The `ReadableStream` interface of the Streams API represents a readable stream of byte data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream)
 */
open external class ReadableStream<R : JsAny?>(
    underlyingSource: UnderlyingByteSource,
    strategy: QueuingStrategy<R> = definedExternally,
) : Transferable,
    AsyncIterable<R>,
    AsyncCloseableDisposable {
    constructor(
        underlyingSource: UnderlyingDefaultSource<R>,
        strategy: QueuingStrategy<R> = definedExternally,
    )

    constructor(
        underlyingSource: UnderlyingSource<R> = definedExternally,
        strategy: QueuingStrategy<R> = definedExternally,
    )

    /**
     * The **`locked`** read-only property of the ReadableStream interface returns whether or not the readable stream is locked to a reader.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/locked)
     */
    val locked: Boolean

    /**
     * The **`cancel()`** method of the ReadableStream interface returns a Promise that resolves when the stream is canceled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/cancel)
     */
    @JsName("cancel")
    fun cancelAsync(reason: JsError? = definedExternally): Promise<Void>

    /**
     * The **`getReader()`** method of the ReadableStream interface creates a reader and locks the stream to it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/getReader)
     */
    fun getReader(): ReadableStreamDefaultReader<R>
    fun getReader(options: ReadableStreamGetReaderOptions = definedExternally): ReadableStreamReader

    /**
     * The **`pipeThrough()`** method of the ReadableStream interface provides a chainable way of piping the current stream through a transform stream or any other writable/readable pair.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/pipeThrough)
     */
    fun <T : JsAny?> pipeThrough(
        transform: ReadableWritablePair<T, R>,
        options: StreamPipeOptions = definedExternally,
    ): ReadableStream<T>

    /**
     * The **`pipeTo()`** method of the ReadableStream interface pipes the current `ReadableStream` to a given WritableStream and returns a Promise that fulfills when the piping process completes successfully, or rejects if any errors were encountered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/pipeTo)
     */
    @JsName("pipeTo")
    fun pipeToAsync(
        destination: WritableStream<R>,
        options: StreamPipeOptions = definedExternally,
    ): Promise<Void>

    /**
     * The **`tee()`** method of the ReadableStream interface tees the current readable stream, returning a two-element array containing the two resulting branches as new ReadableStream instances.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/tee)
     */
    fun tee(): Tuple2<ReadableStream<R>, ReadableStream<R>>
    fun values(options: ReadableStreamIteratorOptions = definedExternally): AsyncIterator<R>
}

/**
 * The **`cancel()`** method of the ReadableStream interface returns a Promise that resolves when the stream is canceled.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/cancel)
 */
suspend inline fun <R : JsAny?> ReadableStream<R>.cancel(reason: JsError?) {
    cancelAsync(
        reason = reason,
    ).await()
}

/**
 * The **`cancel()`** method of the ReadableStream interface returns a Promise that resolves when the stream is canceled.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/cancel)
 */
suspend inline fun <R : JsAny?> ReadableStream<R>.cancel() {
    cancelAsync().await()
}

/**
 * The **`pipeTo()`** method of the ReadableStream interface pipes the current `ReadableStream` to a given WritableStream and returns a Promise that fulfills when the piping process completes successfully, or rejects if any errors were encountered.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/pipeTo)
 */
suspend fun <R : JsAny?> ReadableStream<R>.pipeTo(
    destination: WritableStream<R>,
    options: StreamPipeOptions,
) {
    val controller = AbortController()
    pipeToAsync(
        destination = destination,
        options = patchAbortOptions(options, controller),
    ).awaitCancellable(controller)
}

/**
 * The **`pipeTo()`** method of the ReadableStream interface pipes the current `ReadableStream` to a given WritableStream and returns a Promise that fulfills when the piping process completes successfully, or rejects if any errors were encountered.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/pipeTo)
 */
suspend fun <R : JsAny?> ReadableStream<R>.pipeTo(
    destination: WritableStream<R>,
) {
    val controller = AbortController()
    pipeToAsync(
        destination = destination,
        options = createAbortable(controller),
    ).awaitCancellable(controller)
}
