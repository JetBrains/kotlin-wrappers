// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCIceRole

inline val RTCIceRole.Companion.controlled: RTCIceRole
    get() = unsafeCast("controlled")

inline val RTCIceRole.Companion.controlling: RTCIceRole
    get() = unsafeCast("controlling")

inline val RTCIceRole.Companion.unknown: RTCIceRole
    get() = unsafeCast("unknown")
