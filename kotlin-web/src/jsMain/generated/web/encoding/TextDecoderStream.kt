// Automatically generated - do not modify!

@file:Suppress(
    "ABSTRACT_MEMBER_NOT_IMPLEMENTED",
)

package web.encoding

import js.buffer.BufferSource
import web.streams.GenericTransformStream
import web.streams.ReadableStream
import web.streams.WritableStream

external class TextDecoderStream(
    label: String = definedExternally,
    options: TextDecoderOptions = definedExternally,
) : GenericTransformStream,
    TextDecoderCommon {
    override val readable: ReadableStream<String>
    override val writable: WritableStream<BufferSource>
}
