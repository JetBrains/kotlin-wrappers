// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCDtlsTransportState {
    companion object
}

inline val RTCDtlsTransportState.Companion.closed: RTCDtlsTransportState
    get() = unsafeCast("closed")

inline val RTCDtlsTransportState.Companion.connected: RTCDtlsTransportState
    get() = unsafeCast("connected")

inline val RTCDtlsTransportState.Companion.connecting: RTCDtlsTransportState
    get() = unsafeCast("connecting")

inline val RTCDtlsTransportState.Companion.failed: RTCDtlsTransportState
    get() = unsafeCast("failed")

inline val RTCDtlsTransportState.Companion.new: RTCDtlsTransportState
    get() = unsafeCast("new")
