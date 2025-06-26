// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.transport

import js.reflect.unsafeCast

sealed external interface WebTransportCongestionControl {
    companion object
}

inline val WebTransportCongestionControl.Companion.default: WebTransportCongestionControl
    get() = unsafeCast("default")

inline val WebTransportCongestionControl.Companion.lowLatency: WebTransportCongestionControl
    get() = unsafeCast("lowLatency")

inline val WebTransportCongestionControl.Companion.throughput: WebTransportCongestionControl
    get() = unsafeCast("throughput")
