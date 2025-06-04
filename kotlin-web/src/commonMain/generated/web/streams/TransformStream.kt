// Automatically generated - do not modify!

package web.streams

import js.core.JsAny
import js.serialization.Transferable
import kotlin.js.definedExternally

/**
 * The **`TransformStream`** interface of the Streams API represents a concrete implementation of the pipe chain _transform stream_ concept.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream)
 */
open external class TransformStream<I : JsAny?, O : JsAny?>(
    transformer: Transformer<I, O> = definedExternally,
    writableStrategy: QueuingStrategy<I> = definedExternally,
    readableStrategy: QueuingStrategy<O> = definedExternally,
) : Transferable {
    /**
     * The **`readable`** read-only property of the TransformStream interface returns the ReadableStream instance controlled by this `TransformStream`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream/readable)
     */
    val readable: ReadableStream<O>

    /**
     * The **`writable`** read-only property of the TransformStream interface returns the WritableStream instance controlled by this `TransformStream`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream/writable)
     */
    val writable: WritableStream<I>
}
