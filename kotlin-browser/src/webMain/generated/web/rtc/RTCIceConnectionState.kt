// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCIceConnectionState

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
