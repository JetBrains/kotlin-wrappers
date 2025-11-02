// Automatically generated - do not modify!

package web.encoding

import js.buffer.ArrayBuffer
import js.typedarrays.Uint8Array
import web.streams.GenericTransformStream
import web.streams.ReadableStream
import web.streams.WritableStream
import kotlin.js.JsString

/**
 * The **`TextEncoderStream`** interface of the Encoding API converts a stream of strings into bytes in the UTF-8 encoding. It is the streaming equivalent of TextEncoder.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoderStream)
 */
open external class TextEncoderStream :
    GenericTransformStream,
    TextEncoderCommon {
    override val readable: ReadableStream<Uint8Array<ArrayBuffer>>
    override val writable: WritableStream<JsString>
}
