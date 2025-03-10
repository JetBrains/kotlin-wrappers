// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.rtc

import seskar.js.JsValue

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
