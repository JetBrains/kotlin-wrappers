// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/state)
 */
@JsUnion
sealed /* union */
external interface RTCDtlsTransportState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/state#closed)
 */
inline val RTCDtlsTransportState.Companion.closed: RTCDtlsTransportState
    get() = unsafeCast("closed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/state#connected)
 */
inline val RTCDtlsTransportState.Companion.connected: RTCDtlsTransportState
    get() = unsafeCast("connected")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/state#connecting)
 */
inline val RTCDtlsTransportState.Companion.connecting: RTCDtlsTransportState
    get() = unsafeCast("connecting")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/state#failed)
 */
inline val RTCDtlsTransportState.Companion.failed: RTCDtlsTransportState
    get() = unsafeCast("failed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/state#new)
 */
inline val RTCDtlsTransportState.Companion.new: RTCDtlsTransportState
    get() = unsafeCast("new")
