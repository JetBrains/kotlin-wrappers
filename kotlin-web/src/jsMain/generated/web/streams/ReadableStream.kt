// Automatically generated - do not modify!

package web.streams

import js.array.JsTuple2
import js.core.Void
import js.errors.JsError
import js.promise.Promise
import js.transferable.Transferable
import seskar.js.JsAsync

/**
 * This Streams API interface represents a readable stream of byte data. The Fetch API offers a concrete instance of a ReadableStream through the body property of a Response object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream)
 */
external class ReadableStream<R>(
    underlyingSource: UnderlyingDefaultSource<R>,
    strategy: QueuingStrategy<R> = definedExternally,
) : Transferable {
    constructor(
        underlyingSource: UnderlyingSource<R> = definedExternally,
        strategy: QueuingStrategy<R> = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/locked)
     */
    val locked: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/cancel)
     */
    @JsAsync
    suspend fun cancel(reason: JsError? = definedExternally)

    @JsName("cancel")
    fun cancelAsync(reason: JsError? = definedExternally): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/getReader)
     */
    fun getReader(): ReadableStreamDefaultReader<R>
    fun getReader(options: ReadableStreamGetReaderOptions = definedExternally): ReadableStreamReader

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/pipeThrough)
     */
    fun <T> pipeThrough(
        transform: ReadableWritablePair<T, R>,
        options: StreamPipeOptions = definedExternally,
    ): ReadableStream<T>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/pipeTo)
     */
    @JsAsync
    suspend fun pipeTo(
        destination: WritableStream<R>,
        options: StreamPipeOptions = definedExternally,
    )

    @JsName("pipeTo")
    fun pipeToAsync(
        destination: WritableStream<R>,
        options: StreamPipeOptions = definedExternally,
    ): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/tee)
     */
    fun tee(): JsTuple2<ReadableStream<R>, ReadableStream<R>>
}
