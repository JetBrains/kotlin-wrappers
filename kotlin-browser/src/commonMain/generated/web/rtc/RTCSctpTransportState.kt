// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCSctpTransportState {
    companion object
}

inline val RTCSctpTransportState.Companion.closed: RTCSctpTransportState
    get() = unsafeCast("closed")

inline val RTCSctpTransportState.Companion.connected: RTCSctpTransportState
    get() = unsafeCast("connected")

inline val RTCSctpTransportState.Companion.connecting: RTCSctpTransportState
    get() = unsafeCast("connecting")
