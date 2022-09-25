// Automatically generated - do not modify!

package node.stream.web

import kotlinx.js.ReadonlyArray
import kotlinx.js.Void
import kotlin.js.Promise

external interface ReadableStream<R> {
    val locked: Boolean
    fun cancel(reason: Any = definedExternally): Promise<Void>
    fun getReader(): ReadableStreamDefaultReader<R>
    fun <T> pipeThrough(
        transform: ReadableWritablePair<T, R>,
        options: StreamPipeOptions = definedExternally,
    ): ReadableStream<T>

    fun pipeTo(
        destination: WritableStream<R>,
        options: StreamPipeOptions = definedExternally,
    ): Promise<Void>

    fun tee(): ReadonlyArray<*> /* [ReadableStream<R>, ReadableStream<R>] */

    // HIDDEN METHOD START
    /*
    values(options?: { preventCancel?: boolean }): AsyncIterableIterator<R>
    */
    // HIDDEN METHOD END

    /* [Symbol.asyncIterator](): AsyncIterableIterator<R> */
}
