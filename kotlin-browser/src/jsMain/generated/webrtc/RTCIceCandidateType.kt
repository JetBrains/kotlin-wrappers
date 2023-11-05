// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webrtc

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface RTCIceCandidateType {
    companion object {
        @JsValue("host")
        val host: RTCIceCandidateType

        @JsValue("prflx")
        val prflx: RTCIceCandidateType

        @JsValue("relay")
        val relay: RTCIceCandidateType

        @JsValue("srflx")
        val srflx: RTCIceCandidateType
    }
}
