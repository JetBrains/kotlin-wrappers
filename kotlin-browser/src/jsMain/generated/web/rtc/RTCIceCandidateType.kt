// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
