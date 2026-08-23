// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/dtlsRole)
 */
@JsUnion
sealed /* union */
external interface RTCDtlsRole

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/dtlsRole#client)
 */
inline val RTCDtlsRole.Companion.client: RTCDtlsRole
    get() = unsafeCast("client")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/dtlsRole#server)
 */
inline val RTCDtlsRole.Companion.server: RTCDtlsRole
    get() = unsafeCast("server")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/dtlsRole#unknown)
 */
inline val RTCDtlsRole.Companion.unknown: RTCDtlsRole
    get() = unsafeCast("unknown")
