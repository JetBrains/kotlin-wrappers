// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionState)
 */
@JsUnion
sealed /* union */
external interface RTCPeerConnectionState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionState#closed)
 */
inline val RTCPeerConnectionState.Companion.closed: RTCPeerConnectionState
    get() = unsafeCast("closed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionState#connected)
 */
inline val RTCPeerConnectionState.Companion.connected: RTCPeerConnectionState
    get() = unsafeCast("connected")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionState#connecting)
 */
inline val RTCPeerConnectionState.Companion.connecting: RTCPeerConnectionState
    get() = unsafeCast("connecting")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionState#disconnected)
 */
inline val RTCPeerConnectionState.Companion.disconnected: RTCPeerConnectionState
    get() = unsafeCast("disconnected")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionState#failed)
 */
inline val RTCPeerConnectionState.Companion.failed: RTCPeerConnectionState
    get() = unsafeCast("failed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionState#new)
 */
inline val RTCPeerConnectionState.Companion.new: RTCPeerConnectionState
    get() = unsafeCast("new")
