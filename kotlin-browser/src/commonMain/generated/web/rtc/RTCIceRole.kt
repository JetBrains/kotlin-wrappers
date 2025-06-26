// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCIceRole {
    companion object
}

inline val RTCIceRole.Companion.controlled: RTCIceRole
    get() = unsafeCast("controlled")

inline val RTCIceRole.Companion.controlling: RTCIceRole
    get() = unsafeCast("controlling")

inline val RTCIceRole.Companion.unknown: RTCIceRole
    get() = unsafeCast("unknown")
