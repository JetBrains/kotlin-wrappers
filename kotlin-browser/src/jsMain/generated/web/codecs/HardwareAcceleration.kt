// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
