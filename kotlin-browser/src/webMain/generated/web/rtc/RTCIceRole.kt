// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/role)
 */
@JsUnion
sealed /* union */
external interface RTCIceRole

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/role#controlled)
 */
inline val RTCIceRole.Companion.controlled: RTCIceRole
    get() = unsafeCast("controlled")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/role#controlling)
 */
inline val RTCIceRole.Companion.controlling: RTCIceRole
    get() = unsafeCast("controlling")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/role#unknown)
 */
inline val RTCIceRole.Companion.unknown: RTCIceRole
    get() = unsafeCast("unknown")
