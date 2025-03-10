// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
