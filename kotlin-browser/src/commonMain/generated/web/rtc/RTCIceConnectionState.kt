// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.rtc

import seskar.js.JsValue

sealed external interface RTCIceConnectionState {
    companion object {
        @JsValue("checking")
        val checking: RTCIceConnectionState

        @JsValue("closed")
        val closed: RTCIceConnectionState

        @JsValue("completed")
        val completed: RTCIceConnectionState

        @JsValue("connected")
        val connected: RTCIceConnectionState

        @JsValue("disconnected")
        val disconnected: RTCIceConnectionState

        @JsValue("failed")
        val failed: RTCIceConnectionState

        @JsValue("new")
        val new: RTCIceConnectionState
    }
}
