// Automatically generated - do not modify!

package web.encoding

import js.typedarrays.Uint8Array

sealed external class TextEncoder :
    TextEncoderCommon {
    /** Returns the result of running UTF-8's encoder. */
    fun encode(input: String = definedExternally): Uint8Array

    /** Runs the UTF-8 encoder on source, stores the result of that operation into destination, and returns the progress made as an object wherein read is the number of converted code units of source and written is the number of bytes modified in destination. */
    fun encodeInto(
        source: String,
        destination: Uint8Array,
    ): TextEncoderEncodeIntoResult
}
