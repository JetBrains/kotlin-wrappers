// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCSctpTransportState

inline val RTCSctpTransportState.Companion.closed: RTCSctpTransportState
    get() = unsafeCast("closed")

inline val RTCSctpTransportState.Companion.connected: RTCSctpTransportState
    get() = unsafeCast("connected")

inline val RTCSctpTransportState.Companion.connecting: RTCSctpTransportState
    get() = unsafeCast("connecting")
