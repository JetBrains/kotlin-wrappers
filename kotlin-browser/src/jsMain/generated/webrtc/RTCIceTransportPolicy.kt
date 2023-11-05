// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webrtc

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface RTCIceTransportPolicy {
    companion object {
        @JsValue("all")
        val all: RTCIceTransportPolicy

        @JsValue("relay")
        val relay: RTCIceTransportPolicy
    }
}
