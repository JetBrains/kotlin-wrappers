// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webrtc

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface RTCIceTcpCandidateType {
    companion object {
        @JsValue("active")
        val active: RTCIceTcpCandidateType

        @JsValue("passive")
        val passive: RTCIceTcpCandidateType

        @JsValue("so")
        val so: RTCIceTcpCandidateType
    }
}
