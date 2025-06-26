// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCIceCandidateType {
    companion object
}

inline val RTCIceCandidateType.Companion.host: RTCIceCandidateType
    get() = unsafeCast("host")

inline val RTCIceCandidateType.Companion.prflx: RTCIceCandidateType
    get() = unsafeCast("prflx")

inline val RTCIceCandidateType.Companion.relay: RTCIceCandidateType
    get() = unsafeCast("relay")

inline val RTCIceCandidateType.Companion.srflx: RTCIceCandidateType
    get() = unsafeCast("srflx")
