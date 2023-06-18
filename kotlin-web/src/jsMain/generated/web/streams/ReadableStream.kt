// Automatically generated - do not modify!

package web.streams

import js.core.JsTuple2
import js.core.Void
import kotlin.js.Promise

external class ReadableStream<R>(
    underlyingSource: UnderlyingDefaultSource<R>,
    strategy: QueuingStrategy<R> = definedExternally,
) {
    constructor(
        underlyingSource: UnderlyingSource<R> = definedExternally,
        strategy: QueuingStrategy<R> = definedExternally,
    )

    val locked: Boolean
    fun cancel(reason: Any? = definedExternally): Promise<Void>
    fun getReader(): ReadableStreamDefaultReader<R>
    fun getReader(options: ReadableStreamGetReaderOptions = definedExternally): ReadableStreamReader
    fun <T> pipeThrough(
        transform: ReadableWritablePair<T, R>,
        options: StreamPipeOptions = definedExternally,
    ): ReadableStream<T>

    fun pipeTo(
        destination: WritableStream<R>,
        options: StreamPipeOptions = definedExternally,
    ): Promise<Void>

    fun tee(): JsTuple2<ReadableStream<R>, ReadableStream<R>>
}
