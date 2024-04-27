// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
