// Automatically generated - do not modify!

@file:Suppress(
    "SEALED_INHERITOR_IN_DIFFERENT_PACKAGE",
)

package web.encoding

import js.buffer.BufferSource
import web.streams.GenericTransformStream
import web.streams.ReadableStream
import web.streams.WritableStream

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoderStream) */
external class TextDecoderStream(
    label: String = definedExternally,
    options: TextDecoderOptions = definedExternally,
) : GenericTransformStream,
    TextDecoderCommon {
    override val readable: ReadableStream<String>
    override val writable: WritableStream<BufferSource>
}
