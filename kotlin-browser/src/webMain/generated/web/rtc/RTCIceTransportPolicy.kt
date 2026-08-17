// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCIceTransportPolicy

inline val RTCIceTransportPolicy.Companion.all: RTCIceTransportPolicy
    get() = unsafeCast("all")

inline val RTCIceTransportPolicy.Companion.relay: RTCIceTransportPolicy
    get() = unsafeCast("relay")
