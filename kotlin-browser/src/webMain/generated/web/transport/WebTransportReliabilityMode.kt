// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.transport

import js.reflect.unsafeCast

sealed external interface WebTransportReliabilityMode {
    companion object
}

inline val WebTransportReliabilityMode.Companion.pending: WebTransportReliabilityMode
    get() = unsafeCast("pending")

inline val WebTransportReliabilityMode.Companion.reliableOnly: WebTransportReliabilityMode
    get() = unsafeCast("reliable-only")

inline val WebTransportReliabilityMode.Companion.supportsUnreliable: WebTransportReliabilityMode
    get() = unsafeCast("supports-unreliable")
