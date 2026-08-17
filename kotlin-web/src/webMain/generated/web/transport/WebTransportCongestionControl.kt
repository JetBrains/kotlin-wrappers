// Automatically generated - do not modify!

package web.transport

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface WebTransportCongestionControl

inline val WebTransportCongestionControl.Companion.default: WebTransportCongestionControl
    get() = unsafeCast("default")

inline val WebTransportCongestionControl.Companion.lowLatency: WebTransportCongestionControl
    get() = unsafeCast("low-latency")

inline val WebTransportCongestionControl.Companion.throughput: WebTransportCongestionControl
    get() = unsafeCast("throughput")
