// Automatically generated - do not modify!

package web.streams

import js.array.JsTuple2
import js.core.JsAny
import js.core.Void
import js.errors.JsError
import js.iterable.AsyncIterable
import js.iterable.AsyncIterator
import js.promise.Promise
import js.transferable.Transferable
import seskar.js.JsAsync
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The `ReadableStream` interface of the Streams API represents a readable stream of byte data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream)
 */
open external class ReadableStream<R : JsAny?>(
    underlyingSource: UnderlyingDefaultSource<R>,
    strategy: QueuingStrategy<R> = definedExternally,
) : Transferable,
    AsyncIterable<R> {
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
    @Suppress("WRONG_EXTERNAL_DECLARATION")
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
    fun <T : JsAny?> pipeThrough(
        transform: ReadableWritablePair<T, R>,
        options: StreamPipeOptions = definedExternally,
    ): ReadableStream<T>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/pipeTo)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
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
    fun values(options: ReadableStreamIteratorOptions = definedExternally): AsyncIterator<R>
}
