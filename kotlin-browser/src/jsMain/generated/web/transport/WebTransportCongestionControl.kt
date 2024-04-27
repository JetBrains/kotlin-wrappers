// Automatically generated - do not modify!

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
