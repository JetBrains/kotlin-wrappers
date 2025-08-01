// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCDataChannelState {
    companion object
}

inline val RTCDataChannelState.Companion.closed: RTCDataChannelState
    get() = unsafeCast("closed")

inline val RTCDataChannelState.Companion.closing: RTCDataChannelState
    get() = unsafeCast("closing")

inline val RTCDataChannelState.Companion.connecting: RTCDataChannelState
    get() = unsafeCast("connecting")

inline val RTCDataChannelState.Companion.open: RTCDataChannelState
    get() = unsafeCast("open")
