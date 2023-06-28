// Automatically generated - do not modify!

package web.streams

import js.core.JsTuple2
import js.core.Void
import js.promise.Promise

/**
 * This Streams API interface represents a readable stream of byte data. The Fetch API offers a concrete instance of a ReadableStream through the body property of a Response object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream)
 */
external class ReadableStream<R>(
    underlyingSource: UnderlyingDefaultSource<R>,
    strategy: QueuingStrategy<R> = definedExternally,
) {
    constructor(
        underlyingSource: UnderlyingSource<R> = definedExternally,
        strategy: QueuingStrategy<R> = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/locked) */
    val locked: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/cancel) */
    fun cancel(reason: Any? = definedExternally): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/getReader) */
    fun getReader(): ReadableStreamDefaultReader<R>
    fun getReader(options: ReadableStreamGetReaderOptions = definedExternally): ReadableStreamReader

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/pipeThrough) */
    fun <T> pipeThrough(
        transform: ReadableWritablePair<T, R>,
        options: StreamPipeOptions = definedExternally,
    ): ReadableStream<T>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/pipeTo) */
    fun pipeTo(
        destination: WritableStream<R>,
        options: StreamPipeOptions = definedExternally,
    ): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/tee) */
    fun tee(): JsTuple2<ReadableStream<R>, ReadableStream<R>>
}
