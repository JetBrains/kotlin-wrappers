// Automatically generated - do not modify!

package web.transport

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/reliability)
 */
@JsUnion
sealed /* union */
external interface WebTransportReliabilityMode

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/reliability#pending)
 */
inline val WebTransportReliabilityMode.Companion.pending: WebTransportReliabilityMode
    get() = unsafeCast("pending")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/reliability#reliable-only)
 */
inline val WebTransportReliabilityMode.Companion.reliableOnly: WebTransportReliabilityMode
    get() = unsafeCast("reliable-only")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/reliability#supports-unreliable)
 */
inline val WebTransportReliabilityMode.Companion.supportsUnreliable: WebTransportReliabilityMode
    get() = unsafeCast("supports-unreliable")
