// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import js.reflect.unsafeCast

sealed external interface VideoEncoderBitrateMode {
    companion object
}

inline val VideoEncoderBitrateMode.Companion.constant: VideoEncoderBitrateMode
    get() = unsafeCast("constant")

inline val VideoEncoderBitrateMode.Companion.quantizer: VideoEncoderBitrateMode
    get() = unsafeCast("quantizer")

inline val VideoEncoderBitrateMode.Companion.variable: VideoEncoderBitrateMode
    get() = unsafeCast("variable")
