// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import seskar.js.JsValue

sealed external interface VideoEncoderBitrateMode {
    companion object {
        @JsValue("constant")
        val constant: VideoEncoderBitrateMode

        @JsValue("quantizer")
        val quantizer: VideoEncoderBitrateMode

        @JsValue("variable")
        val variable: VideoEncoderBitrateMode
    }
}
