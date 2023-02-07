// Automatically generated - do not modify!

package web.encoding

sealed external interface TextDecoderCommon {
    /** Returns encoding's name, lowercased. */
    val encoding: String

    /** Returns true if error mode is "fatal", otherwise false. */
    val fatal: Boolean

    /** Returns the value of ignore BOM. */
    val ignoreBOM: Boolean
}
