// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webrtc

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface RTCIceComponent {
    companion object {
        @JsValue("rtcp")
        val rtcp: RTCIceComponent

        @JsValue("rtp")
        val rtp: RTCIceComponent
    }
}
