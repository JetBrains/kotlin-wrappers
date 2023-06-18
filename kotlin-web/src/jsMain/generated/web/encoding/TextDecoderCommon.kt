// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.encoding

sealed external interface TextDecoderCommon {
    /** Returns encoding's name, lowercased. */
    val encoding: String
        get() = definedExternally

    /** Returns true if error mode is "fatal", otherwise false. */
    val fatal: Boolean
        get() = definedExternally

    /** Returns the value of ignore BOM. */
    val ignoreBOM: Boolean
        get() = definedExternally
}
