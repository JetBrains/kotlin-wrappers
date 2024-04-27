// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
