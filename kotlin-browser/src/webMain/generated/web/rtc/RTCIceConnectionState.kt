// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCIceConnectionState {
    companion object
}

inline val RTCIceConnectionState.Companion.checking: RTCIceConnectionState
    get() = unsafeCast("checking")

inline val RTCIceConnectionState.Companion.closed: RTCIceConnectionState
    get() = unsafeCast("closed")

inline val RTCIceConnectionState.Companion.completed: RTCIceConnectionState
    get() = unsafeCast("completed")

inline val RTCIceConnectionState.Companion.connected: RTCIceConnectionState
    get() = unsafeCast("connected")

inline val RTCIceConnectionState.Companion.disconnected: RTCIceConnectionState
    get() = unsafeCast("disconnected")

inline val RTCIceConnectionState.Companion.failed: RTCIceConnectionState
    get() = unsafeCast("failed")

inline val RTCIceConnectionState.Companion.new: RTCIceConnectionState
    get() = unsafeCast("new")
