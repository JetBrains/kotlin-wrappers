// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.transport

import seskar.js.JsValue

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
