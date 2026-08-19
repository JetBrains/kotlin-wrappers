// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/state)
 */
@JsUnion
sealed /* union */
external interface RTCSctpTransportState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/state#closed)
 */
inline val RTCSctpTransportState.Companion.closed: RTCSctpTransportState
    get() = unsafeCast("closed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/state#connected)
 */
inline val RTCSctpTransportState.Companion.connected: RTCSctpTransportState
    get() = unsafeCast("connected")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/state#connecting)
 */
inline val RTCSctpTransportState.Companion.connecting: RTCSctpTransportState
    get() = unsafeCast("connecting")
