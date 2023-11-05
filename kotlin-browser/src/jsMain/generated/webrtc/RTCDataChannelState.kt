// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webrtc

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
