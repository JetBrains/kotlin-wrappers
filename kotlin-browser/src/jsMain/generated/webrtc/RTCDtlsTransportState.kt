// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webrtc

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface RTCDtlsTransportState {
    companion object {
        @JsValue("closed")
        val closed: RTCDtlsTransportState

        @JsValue("connected")
        val connected: RTCDtlsTransportState

        @JsValue("connecting")
        val connecting: RTCDtlsTransportState

        @JsValue("failed")
        val failed: RTCDtlsTransportState

        @JsValue("new")
        val new: RTCDtlsTransportState
    }
}
