// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCIceCandidateType

inline val RTCIceCandidateType.Companion.host: RTCIceCandidateType
    get() = unsafeCast("host")

inline val RTCIceCandidateType.Companion.prflx: RTCIceCandidateType
    get() = unsafeCast("prflx")

inline val RTCIceCandidateType.Companion.relay: RTCIceCandidateType
    get() = unsafeCast("relay")

inline val RTCIceCandidateType.Companion.srflx: RTCIceCandidateType
    get() = unsafeCast("srflx")
