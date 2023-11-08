// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.transport

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface WebTransportCongestionControl {
    companion object {
        @JsValue("default")
        val default: WebTransportCongestionControl

        @JsValue("low-latency")
        val lowLatency: WebTransportCongestionControl

        @JsValue("throughput")
        val throughput: WebTransportCongestionControl
    }
}
