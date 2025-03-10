// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.codecs

import seskar.js.JsValue

sealed external interface VideoMatrixCoefficients {
    companion object {
        @JsValue("bt470bg")
        val bt470bg: VideoMatrixCoefficients

        @JsValue("bt709")
        val bt709: VideoMatrixCoefficients

        @JsValue("rgb")
        val rgb: VideoMatrixCoefficients

        @JsValue("smpte170m")
        val smpte170m: VideoMatrixCoefficients
    }
}
