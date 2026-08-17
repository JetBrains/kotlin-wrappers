// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCPeerConnectionState

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
