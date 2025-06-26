// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCIceTcpCandidateType {
    companion object
}

inline val RTCIceTcpCandidateType.Companion.active: RTCIceTcpCandidateType
    get() = unsafeCast("active")

inline val RTCIceTcpCandidateType.Companion.passive: RTCIceTcpCandidateType
    get() = unsafeCast("passive")

inline val RTCIceTcpCandidateType.Companion.so: RTCIceTcpCandidateType
    get() = unsafeCast("so")
