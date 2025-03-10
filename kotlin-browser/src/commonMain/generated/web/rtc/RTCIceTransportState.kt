// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.rtc

import seskar.js.JsValue

sealed external interface RTCIceTransportState {
    companion object {
        @JsValue("checking")
        val checking: RTCIceTransportState

        @JsValue("closed")
        val closed: RTCIceTransportState

        @JsValue("completed")
        val completed: RTCIceTransportState

        @JsValue("connected")
        val connected: RTCIceTransportState

        @JsValue("disconnected")
        val disconnected: RTCIceTransportState

        @JsValue("failed")
        val failed: RTCIceTransportState

        @JsValue("new")
        val new: RTCIceTransportState
    }
}
