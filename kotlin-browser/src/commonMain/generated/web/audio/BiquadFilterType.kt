// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.audio

import seskar.js.JsValue

sealed external interface BiquadFilterType {
    companion object {
        @JsValue("allpass")
        val allpass: BiquadFilterType

        @JsValue("bandpass")
        val bandpass: BiquadFilterType

        @JsValue("highpass")
        val highpass: BiquadFilterType

        @JsValue("highshelf")
        val highshelf: BiquadFilterType

        @JsValue("lowpass")
        val lowpass: BiquadFilterType

        @JsValue("lowshelf")
        val lowshelf: BiquadFilterType

        @JsValue("notch")
        val notch: BiquadFilterType

        @JsValue("peaking")
        val peaking: BiquadFilterType
    }
}
