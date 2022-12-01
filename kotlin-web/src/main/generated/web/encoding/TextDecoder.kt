// Automatically generated - do not modify!

@file:Suppress(
    "ABSTRACT_MEMBER_NOT_IMPLEMENTED",
)

package web.encoding

import js.buffer.BufferSource

external class TextDecoder(
    label: String = definedExternally,
    options: TextDecoderOptions = definedExternally,
) : TextDecoderCommon {
    /**
     * Returns the result of running encoding's decoder. The method can be invoked zero or more times with options's stream set to true, and then once without options's stream (or set to false), to process a fragmented input. If the invocation without options's stream (or set to false) has no input, it's clearest to omit both arguments.
     *
     * ```
     * var string = "", decoder = new TextDecoder(encoding), buffer;
     * while(buffer = next_chunk()) {
     *   string += decoder.decode(buffer, {stream:true});
     * }
     * string += decoder.decode(); // end-of-queue
     * ```
     *
     * If the error mode is "fatal" and encoding's decoder returns error, throws a TypeError.
     */
    fun decode(
        input: BufferSource = definedExternally,
        options: TextDecodeOptions = definedExternally,
    ): String
}
