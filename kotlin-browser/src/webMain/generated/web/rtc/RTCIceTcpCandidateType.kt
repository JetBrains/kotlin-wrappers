// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCIceTcpCandidateType

inline val RTCIceTcpCandidateType.Companion.active: RTCIceTcpCandidateType
    get() = unsafeCast("active")

inline val RTCIceTcpCandidateType.Companion.passive: RTCIceTcpCandidateType
    get() = unsafeCast("passive")

inline val RTCIceTcpCandidateType.Companion.so: RTCIceTcpCandidateType
    get() = unsafeCast("so")
