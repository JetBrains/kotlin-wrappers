// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
