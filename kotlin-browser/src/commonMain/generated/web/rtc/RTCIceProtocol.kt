// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
