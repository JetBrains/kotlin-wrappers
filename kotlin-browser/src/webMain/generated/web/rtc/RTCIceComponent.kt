// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCIceComponent {
    companion object
}

inline val RTCIceComponent.Companion.rtcp: RTCIceComponent
    get() = unsafeCast("rtcp")

inline val RTCIceComponent.Companion.rtp: RTCIceComponent
    get() = unsafeCast("rtp")
