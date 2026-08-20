// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/type)
 */
@JsUnion
sealed /* union */
external interface RTCIceCandidateType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/type#host)
 */
inline val RTCIceCandidateType.Companion.host: RTCIceCandidateType
    get() = unsafeCast("host")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/type#prflx)
 */
inline val RTCIceCandidateType.Companion.prflx: RTCIceCandidateType
    get() = unsafeCast("prflx")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/type#relay)
 */
inline val RTCIceCandidateType.Companion.relay: RTCIceCandidateType
    get() = unsafeCast("relay")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/type#srflx)
 */
inline val RTCIceCandidateType.Companion.srflx: RTCIceCandidateType
    get() = unsafeCast("srflx")
