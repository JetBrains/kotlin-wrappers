// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/readyState)
 */
@JsUnion
sealed /* union */
external interface RTCDataChannelState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/readyState#closed)
 */
inline val RTCDataChannelState.Companion.closed: RTCDataChannelState
    get() = unsafeCast("closed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/readyState#closing)
 */
inline val RTCDataChannelState.Companion.closing: RTCDataChannelState
    get() = unsafeCast("closing")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/readyState#connecting)
 */
inline val RTCDataChannelState.Companion.connecting: RTCDataChannelState
    get() = unsafeCast("connecting")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/readyState#open)
 */
inline val RTCDataChannelState.Companion.open: RTCDataChannelState
    get() = unsafeCast("open")
