// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
