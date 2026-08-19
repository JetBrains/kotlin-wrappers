// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/tcpType)
 */
@JsUnion
sealed /* union */
external interface RTCIceTcpCandidateType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/tcpType#active)
 */
inline val RTCIceTcpCandidateType.Companion.active: RTCIceTcpCandidateType
    get() = unsafeCast("active")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/tcpType#passive)
 */
inline val RTCIceTcpCandidateType.Companion.passive: RTCIceTcpCandidateType
    get() = unsafeCast("passive")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidate/tcpType#so)
 */
inline val RTCIceTcpCandidateType.Companion.so: RTCIceTcpCandidateType
    get() = unsafeCast("so")
