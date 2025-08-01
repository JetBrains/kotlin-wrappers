// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCIceTransportPolicy {
    companion object
}

inline val RTCIceTransportPolicy.Companion.all: RTCIceTransportPolicy
    get() = unsafeCast("all")

inline val RTCIceTransportPolicy.Companion.relay: RTCIceTransportPolicy
    get() = unsafeCast("relay")
