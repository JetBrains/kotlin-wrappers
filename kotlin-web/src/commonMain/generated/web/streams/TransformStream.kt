// Automatically generated - do not modify!

package web.streams

import js.core.JsAny
import js.transferable.Transferable
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream)
 */
open external class TransformStream<I : JsAny?, O : JsAny?>(
    transformer: Transformer<I, O> = definedExternally,
    writableStrategy: QueuingStrategy<I> = definedExternally,
    readableStrategy: QueuingStrategy<O> = definedExternally,
) : Transferable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream/readable)
     */
    val readable: ReadableStream<O>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream/writable)
     */
    val writable: WritableStream<I>
}
