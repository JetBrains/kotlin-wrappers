// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/component)
 */
@JsUnion
sealed /* union */
external interface RTCIceComponent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/component#rtcp)
 */
inline val RTCIceComponent.Companion.rtcp: RTCIceComponent
    get() = unsafeCast("rtcp")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/component#rtp)
 */
inline val RTCIceComponent.Companion.rtp: RTCIceComponent
    get() = unsafeCast("rtp")
