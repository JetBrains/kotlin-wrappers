// Automatically generated - do not modify!

package web.encoding

import js.buffer.BufferSource
import web.streams.GenericTransformStream
import web.streams.ReadableStream
import web.streams.WritableStream
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * The **`TextDecoderStream`** interface of the Encoding API converts a stream of text in a binary encoding, such as UTF-8 etc., to a stream of strings. It is the streaming equivalent of TextDecoder. It implements the same shape as a TransformStream, allowing it to be used in ReadableStream.pipeThrough() and similar methods.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoderStream)
 */
open external class TextDecoderStream(
    label: String = definedExternally,
    options: TextDecoderOptions = definedExternally,
) : GenericTransformStream,
    TextDecoderCommon {
    /**
     * The **`readable`** read-only property of the TextDecoderStream interface returns a ReadableStream that emits decoded strings.
     */
    override val readable: ReadableStream<JsString>

    /**
     * The **`writable`** read-only property of the TextDecoderStream interface returns a WritableStream that accepts binary data, in the form of ArrayBuffer, TypedArray, or DataView chunks (SharedArrayBuffer and its views are also allowed), to be decoded into strings.
     */
    override val writable: WritableStream<BufferSource>
}
