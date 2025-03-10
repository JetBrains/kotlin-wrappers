// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.rtc

import seskar.js.JsValue

sealed external interface RTCIceTransportPolicy {
    companion object {
        @JsValue("all")
        val all: RTCIceTransportPolicy

        @JsValue("relay")
        val relay: RTCIceTransportPolicy
    }
}
