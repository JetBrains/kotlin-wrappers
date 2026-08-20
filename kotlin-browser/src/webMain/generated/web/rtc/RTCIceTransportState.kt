// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/state)
 */
@JsUnion
sealed /* union */
external interface RTCIceTransportState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/state#checking)
 */
inline val RTCIceTransportState.Companion.checking: RTCIceTransportState
    get() = unsafeCast("checking")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/state#closed)
 */
inline val RTCIceTransportState.Companion.closed: RTCIceTransportState
    get() = unsafeCast("closed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/state#completed)
 */
inline val RTCIceTransportState.Companion.completed: RTCIceTransportState
    get() = unsafeCast("completed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/state#connected)
 */
inline val RTCIceTransportState.Companion.connected: RTCIceTransportState
    get() = unsafeCast("connected")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/state#disconnected)
 */
inline val RTCIceTransportState.Companion.disconnected: RTCIceTransportState
    get() = unsafeCast("disconnected")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/state#failed)
 */
inline val RTCIceTransportState.Companion.failed: RTCIceTransportState
    get() = unsafeCast("failed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/state#new)
 */
inline val RTCIceTransportState.Companion.new: RTCIceTransportState
    get() = unsafeCast("new")
