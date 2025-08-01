// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCPeerConnectionState {
    companion object
}

inline val RTCPeerConnectionState.Companion.closed: RTCPeerConnectionState
    get() = unsafeCast("closed")

inline val RTCPeerConnectionState.Companion.connected: RTCPeerConnectionState
    get() = unsafeCast("connected")

inline val RTCPeerConnectionState.Companion.connecting: RTCPeerConnectionState
    get() = unsafeCast("connecting")

inline val RTCPeerConnectionState.Companion.disconnected: RTCPeerConnectionState
    get() = unsafeCast("disconnected")

inline val RTCPeerConnectionState.Companion.failed: RTCPeerConnectionState
    get() = unsafeCast("failed")

inline val RTCPeerConnectionState.Companion.new: RTCPeerConnectionState
    get() = unsafeCast("new")
