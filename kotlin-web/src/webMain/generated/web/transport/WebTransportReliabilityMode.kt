// Automatically generated - do not modify!

package web.transport

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface WebTransportReliabilityMode

inline val WebTransportReliabilityMode.Companion.pending: WebTransportReliabilityMode
    get() = unsafeCast("pending")

inline val WebTransportReliabilityMode.Companion.reliableOnly: WebTransportReliabilityMode
    get() = unsafeCast("reliable-only")

inline val WebTransportReliabilityMode.Companion.supportsUnreliable: WebTransportReliabilityMode
    get() = unsafeCast("supports-unreliable")
