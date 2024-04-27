// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface RTCIceTransportPolicy {
    companion object {
        @JsValue("all")
        val all: RTCIceTransportPolicy

        @JsValue("relay")
        val relay: RTCIceTransportPolicy
    }
}
