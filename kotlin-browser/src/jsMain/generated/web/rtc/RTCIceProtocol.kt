// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface RTCIceProtocol {
    companion object {
        @JsValue("tcp")
        val tcp: RTCIceProtocol

        @JsValue("udp")
        val udp: RTCIceProtocol
    }
}
