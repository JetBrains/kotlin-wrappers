// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCIceProtocol {
    companion object
}

inline val RTCIceProtocol.Companion.tcp: RTCIceProtocol
    get() = unsafeCast("tcp")

inline val RTCIceProtocol.Companion.udp: RTCIceProtocol
    get() = unsafeCast("udp")
