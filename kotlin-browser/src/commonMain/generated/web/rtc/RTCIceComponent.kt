// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import seskar.js.JsValue

sealed external interface RTCIceComponent {
    companion object {
        @JsValue("rtcp")
        val rtcp: RTCIceComponent

        @JsValue("rtp")
        val rtp: RTCIceComponent
    }
}
