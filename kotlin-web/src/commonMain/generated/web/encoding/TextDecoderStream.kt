// Automatically generated - do not modify!

@file:Suppress(
    "SEALED_INHERITOR_IN_DIFFERENT_PACKAGE",
)

package web.encoding

import js.buffer.BufferSource
import js.core.JsString
import web.streams.GenericTransformStream
import web.streams.ReadableStream
import web.streams.WritableStream
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoderStream)
 */
open external class TextDecoderStream(
    label: String = definedExternally,
    options: TextDecoderOptions = definedExternally,
) : GenericTransformStream,
    TextDecoderCommon {
    override val readable: ReadableStream<JsString>
    override val writable: WritableStream<BufferSource>
}
