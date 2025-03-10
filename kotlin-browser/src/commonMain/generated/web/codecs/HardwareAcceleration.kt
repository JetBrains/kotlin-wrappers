// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.codecs

import seskar.js.JsValue

sealed external interface HardwareAcceleration {
    companion object {
        @JsValue("no-preference")
        val noPreference: HardwareAcceleration

        @JsValue("prefer-hardware")
        val preferHardware: HardwareAcceleration

        @JsValue("prefer-software")
        val preferSoftware: HardwareAcceleration
    }
}
