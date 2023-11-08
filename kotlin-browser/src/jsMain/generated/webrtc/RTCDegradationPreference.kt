// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webrtc

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface RTCDegradationPreference {
    companion object {
        @JsValue("balanced")
        val balanced: RTCDegradationPreference

        @JsValue("maintain-framerate")
        val maintainFramerate: RTCDegradationPreference

        @JsValue("maintain-resolution")
        val maintainResolution: RTCDegradationPreference
    }
}
