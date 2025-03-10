// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.rtc

import seskar.js.JsValue

sealed external interface RTCDataChannelState {
    companion object {
        @JsValue("closed")
        val closed: RTCDataChannelState

        @JsValue("closing")
        val closing: RTCDataChannelState

        @JsValue("connecting")
        val connecting: RTCDataChannelState

        @JsValue("open")
        val open: RTCDataChannelState
    }
}
