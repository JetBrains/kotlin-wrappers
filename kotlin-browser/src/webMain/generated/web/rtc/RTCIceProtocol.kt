// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/protocol)
 */
@JsUnion
sealed /* union */
external interface RTCIceProtocol

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/protocol#tcp)
 */
inline val RTCIceProtocol.Companion.tcp: RTCIceProtocol
    get() = unsafeCast("tcp")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/protocol#udp)
 */
inline val RTCIceProtocol.Companion.udp: RTCIceProtocol
    get() = unsafeCast("udp")
