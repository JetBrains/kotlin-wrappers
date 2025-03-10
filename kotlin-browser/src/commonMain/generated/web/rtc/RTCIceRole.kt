// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.rtc

import seskar.js.JsValue

sealed external interface RTCIceRole {
    companion object {
        @JsValue("controlled")
        val controlled: RTCIceRole

        @JsValue("controlling")
        val controlling: RTCIceRole

        @JsValue("unknown")
        val unknown: RTCIceRole
    }
}
