// Automatically generated - do not modify!

package web.encoding

import js.buffer.ArrayBuffer
import js.typedarrays.Uint8Array
import web.streams.GenericTransformStream
import web.streams.ReadableStream
import web.streams.WritableStream
import kotlin.js.JsString

/**
 * The **`TextEncoderStream`** interface of the Encoding API converts a stream of strings into bytes in the UTF-8 encoding. It is the streaming equivalent of TextEncoder. It implements the same shape as a TransformStream, allowing it to be used in ReadableStream.pipeThrough() and similar methods.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoderStream)
 */
open external class TextEncoderStream :
    GenericTransformStream,
    TextEncoderCommon {
    /**
     * The **`readable`** read-only property of the TextEncoderStream interface returns a ReadableStream that emits encoded binary data as Uint8Array chunks.
     */
    override val readable: ReadableStream<Uint8Array<ArrayBuffer>>

    /**
     * The **`writable`** read-only property of the TextEncoderStream interface returns a WritableStream that accepts strings to be encoded into binary data.
     */
    override val writable: WritableStream<JsString>
}
