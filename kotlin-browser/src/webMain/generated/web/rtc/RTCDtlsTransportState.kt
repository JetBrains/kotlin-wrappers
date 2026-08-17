// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCDtlsTransportState

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
