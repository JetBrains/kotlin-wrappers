// Automatically generated - do not modify!

package web.streams

external class TransformStream<I, O>(
    transformer: Transformer<I, O> = definedExternally,
    writableStrategy: QueuingStrategy<I> = definedExternally,
    readableStrategy: QueuingStrategy<O> = definedExternally,
) {
    val readable: ReadableStream<O>
    val writable: WritableStream<I>
}
