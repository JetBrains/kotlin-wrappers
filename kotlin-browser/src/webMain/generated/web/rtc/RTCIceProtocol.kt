// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCIceProtocol

inline val RTCIceProtocol.Companion.tcp: RTCIceProtocol
    get() = unsafeCast("tcp")

inline val RTCIceProtocol.Companion.udp: RTCIceProtocol
    get() = unsafeCast("udp")
