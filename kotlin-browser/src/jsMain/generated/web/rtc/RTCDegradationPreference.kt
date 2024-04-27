// Automatically generated - do not modify!

package web.rtc

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
