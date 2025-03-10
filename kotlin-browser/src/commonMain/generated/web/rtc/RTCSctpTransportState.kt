// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.rtc

import seskar.js.JsValue

sealed external interface RTCSctpTransportState {
    companion object {
        @JsValue("closed")
        val closed: RTCSctpTransportState

        @JsValue("connected")
        val connected: RTCSctpTransportState

        @JsValue("connecting")
        val connecting: RTCSctpTransportState
    }
}
