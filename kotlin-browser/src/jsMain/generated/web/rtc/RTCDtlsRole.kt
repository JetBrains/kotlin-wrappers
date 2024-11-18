// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue

sealed external interface RTCDtlsRole {
    companion object {
        @JsValue("client")
        val client: RTCDtlsRole

        @JsValue("server")
        val server: RTCDtlsRole

        @JsValue("unknown")
        val unknown: RTCDtlsRole
    }
}
