// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCDtlsRole {
    companion object
}

inline val RTCDtlsRole.Companion.client: RTCDtlsRole
    get() = unsafeCast("client")

inline val RTCDtlsRole.Companion.server: RTCDtlsRole
    get() = unsafeCast("server")

inline val RTCDtlsRole.Companion.unknown: RTCDtlsRole
    get() = unsafeCast("unknown")
