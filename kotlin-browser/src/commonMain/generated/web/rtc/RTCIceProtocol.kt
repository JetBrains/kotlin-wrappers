// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import seskar.js.JsValue

sealed external interface RTCIceProtocol {
    companion object {
        @JsValue("tcp")
        val tcp: RTCIceProtocol

        @JsValue("udp")
        val udp: RTCIceProtocol
    }
}
