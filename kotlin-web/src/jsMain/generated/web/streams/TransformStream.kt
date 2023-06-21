// Automatically generated - do not modify!

package web.streams

external class TransformStream<I, O>(
    transformer: Transformer<I, O> = definedExternally,
    writableStrategy: QueuingStrategy<I> = definedExternally,
    readableStrategy: QueuingStrategy<O> = definedExternally,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream/readable) */
    val readable: ReadableStream<O>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream/writable) */
    val writable: WritableStream<I>
}
