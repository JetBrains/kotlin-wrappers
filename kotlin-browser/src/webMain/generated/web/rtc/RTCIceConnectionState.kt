// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceConnectionState)
 */
@JsUnion
sealed /* union */
external interface RTCIceConnectionState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceConnectionState#checking)
 */
inline val RTCIceConnectionState.Companion.checking: RTCIceConnectionState
    get() = unsafeCast("checking")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceConnectionState#closed)
 */
inline val RTCIceConnectionState.Companion.closed: RTCIceConnectionState
    get() = unsafeCast("closed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceConnectionState#completed)
 */
inline val RTCIceConnectionState.Companion.completed: RTCIceConnectionState
    get() = unsafeCast("completed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceConnectionState#connected)
 */
inline val RTCIceConnectionState.Companion.connected: RTCIceConnectionState
    get() = unsafeCast("connected")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceConnectionState#disconnected)
 */
inline val RTCIceConnectionState.Companion.disconnected: RTCIceConnectionState
    get() = unsafeCast("disconnected")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceConnectionState#failed)
 */
inline val RTCIceConnectionState.Companion.failed: RTCIceConnectionState
    get() = unsafeCast("failed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceConnectionState#new)
 */
inline val RTCIceConnectionState.Companion.new: RTCIceConnectionState
    get() = unsafeCast("new")
