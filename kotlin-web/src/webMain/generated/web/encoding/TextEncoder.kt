// Automatically generated - do not modify!

package web.encoding

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.typedarrays.Uint8Array
import kotlin.js.definedExternally

/**
 * The **`TextEncoder`** interface enables you to encode a JavaScript string using UTF-8.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoder)
 */
open external class TextEncoder :
    TextEncoderCommon {
    /**
     * The **`TextEncoder.encode()`** method takes a string as input, and returns a Uint8Array containing the string encoded using UTF-8.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoder/encode)
     */
    fun encode(input: String = definedExternally): Uint8Array<ArrayBuffer>

    /**
     * The **`TextEncoder.encodeInto()`** method takes a string to encode and a destination Uint8Array to put resulting UTF-8 encoded text into, and returns an object indicating the progress of the encoding. This is potentially more performant than the encode() method — especially when the target buffer is a view into a Wasm heap.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoder/encodeInto)
     */
    fun encodeInto(
        source: String,
        destination: Uint8Array<ArrayBufferLike>,
    ): TextEncoderEncodeIntoResult
}
