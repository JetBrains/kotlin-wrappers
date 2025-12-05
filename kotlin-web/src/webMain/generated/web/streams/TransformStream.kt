// Automatically generated - do not modify!

package web.streams

import js.serialization.Transferable
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The **`TransformStream`** interface of the Streams API represents a concrete implementation of the pipe chain transform stream concept.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream)
 */
open external class TransformStream<I : JsAny?, O : JsAny?>(
    transformer: Transformer<I, O> = definedExternally,
    writableStrategy: QueuingStrategy<I> = definedExternally,
    readableStrategy: QueuingStrategy<O> = definedExternally,
) : Transferable {
    /**
     * The **`readable`** read-only property of the TransformStream interface returns the ReadableStream instance controlled by this TransformStream. This stream emits the transformed output data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream/readable)
     */
    val readable: ReadableStream<O>

    /**
     * The **`writable`** read-only property of the TransformStream interface returns the WritableStream instance controlled by this TransformStream. This stream accepts input data that will be transformed and emitted to the readable stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream/writable)
     */
    val writable: WritableStream<I>
}
