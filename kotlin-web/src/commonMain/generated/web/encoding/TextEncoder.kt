// Automatically generated - do not modify!

package web.encoding

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.typedarrays.Uint8Array
import kotlin.js.definedExternally

/**
 * The **`TextEncoder`** interface takes a stream of code points as input and emits a stream of UTF-8 bytes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoder)
 */
open external class TextEncoder :
    TextEncoderCommon {
    /**
     * Returns the result of running UTF-8's encoder.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoder/encode)
     */
    fun encode(input: String = definedExternally): Uint8Array<ArrayBuffer>

    /**
     * Runs the UTF-8 encoder on source, stores the result of that operation into destination, and returns the progress made as an object wherein read is the number of converted code units of source and written is the number of bytes modified in destination.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoder/encodeInto)
     */
    fun encodeInto(
        source: String,
        destination: Uint8Array<ArrayBufferLike>,
    ): TextEncoderEncodeIntoResult
}
