// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCIceComponent

inline val RTCIceComponent.Companion.rtcp: RTCIceComponent
    get() = unsafeCast("rtcp")

inline val RTCIceComponent.Companion.rtp: RTCIceComponent
    get() = unsafeCast("rtp")
