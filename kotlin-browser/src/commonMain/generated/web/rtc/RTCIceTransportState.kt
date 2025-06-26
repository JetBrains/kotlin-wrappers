// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCIceTransportState {
    companion object
}

inline val RTCIceTransportState.Companion.checking: RTCIceTransportState
    get() = unsafeCast("checking")

inline val RTCIceTransportState.Companion.closed: RTCIceTransportState
    get() = unsafeCast("closed")

inline val RTCIceTransportState.Companion.completed: RTCIceTransportState
    get() = unsafeCast("completed")

inline val RTCIceTransportState.Companion.connected: RTCIceTransportState
    get() = unsafeCast("connected")

inline val RTCIceTransportState.Companion.disconnected: RTCIceTransportState
    get() = unsafeCast("disconnected")

inline val RTCIceTransportState.Companion.failed: RTCIceTransportState
    get() = unsafeCast("failed")

inline val RTCIceTransportState.Companion.new: RTCIceTransportState
    get() = unsafeCast("new")
