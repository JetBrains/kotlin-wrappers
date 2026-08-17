// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCDtlsRole

inline val RTCDtlsRole.Companion.client: RTCDtlsRole
    get() = unsafeCast("client")

inline val RTCDtlsRole.Companion.server: RTCDtlsRole
    get() = unsafeCast("server")

inline val RTCDtlsRole.Companion.unknown: RTCDtlsRole
    get() = unsafeCast("unknown")
