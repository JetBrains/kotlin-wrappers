// Automatically generated - do not modify!

package web.encoding

import js.buffer.BufferSource
import web.streams.GenericTransformStream
import web.streams.ReadableStream
import web.streams.WritableStream
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * The **`TextDecoderStream`** interface of the Encoding API converts a stream of text in a binary encoding, such as UTF-8 etc., to a stream of strings. It is the streaming equivalent of TextDecoder.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoderStream)
 */
open external class TextDecoderStream(
    label: String = definedExternally,
    options: TextDecoderOptions = definedExternally,
) : GenericTransformStream,
    TextDecoderCommon {
    /**
     * The **`readable`** read-only property of the TextDecoderStream interface returns a ReadableStream.
     */
    override val readable: ReadableStream<JsString>

    /**
     * The **`writable`** read-only property of the TextDecoderStream interface returns a WritableStream.
     */
    override val writable: WritableStream<BufferSource>
}
