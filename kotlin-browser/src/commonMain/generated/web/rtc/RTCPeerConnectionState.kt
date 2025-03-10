// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.rtc

import seskar.js.JsValue

sealed external interface RTCPeerConnectionState {
    companion object {
        @JsValue("closed")
        val closed: RTCPeerConnectionState

        @JsValue("connected")
        val connected: RTCPeerConnectionState

        @JsValue("connecting")
        val connecting: RTCPeerConnectionState

        @JsValue("disconnected")
        val disconnected: RTCPeerConnectionState

        @JsValue("failed")
        val failed: RTCPeerConnectionState

        @JsValue("new")
        val new: RTCPeerConnectionState
    }
}
