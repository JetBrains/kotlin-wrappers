// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
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
