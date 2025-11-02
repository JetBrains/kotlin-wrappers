// Automatically generated - do not modify!

package web.encoding

import js.buffer.AllowSharedBufferSource
import kotlin.js.definedExternally

/**
 * The **`TextDecoder`** interface represents a decoder for a specific text encoding, such as UTF-8, ISO-8859-2, or GBK. A decoder takes an array of bytes as input and returns a JavaScript string.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder)
 */
open external class TextDecoder(
    label: String = definedExternally,
    options: TextDecoderOptions = definedExternally,
) : TextDecoderCommon {
    /**
     * The **`TextDecoder.decode()`** method returns a string containing text decoded from the buffer passed as a parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder/decode)
     */
    fun decode(
        input: AllowSharedBufferSource = definedExternally,
        options: TextDecodeOptions = definedExternally,
    ): String
}
