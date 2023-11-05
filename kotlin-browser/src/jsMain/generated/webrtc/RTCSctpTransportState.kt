// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webrtc

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
