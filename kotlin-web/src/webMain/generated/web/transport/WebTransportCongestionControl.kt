// Automatically generated - do not modify!

package web.transport

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/congestionControl)
 */
@JsUnion
sealed /* union */
external interface WebTransportCongestionControl

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/congestionControl#default)
 */
inline val WebTransportCongestionControl.Companion.default: WebTransportCongestionControl
    get() = unsafeCast("default")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/congestionControl#low-latency)
 */
inline val WebTransportCongestionControl.Companion.lowLatency: WebTransportCongestionControl
    get() = unsafeCast("low-latency")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/congestionControl#throughput)
 */
inline val WebTransportCongestionControl.Companion.throughput: WebTransportCongestionControl
    get() = unsafeCast("throughput")
