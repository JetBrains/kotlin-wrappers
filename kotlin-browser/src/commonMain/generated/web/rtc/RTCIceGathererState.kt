// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCIceGathererState {
    companion object
}

inline val RTCIceGathererState.Companion.complete: RTCIceGathererState
    get() = unsafeCast("complete")

inline val RTCIceGathererState.Companion.gathering: RTCIceGathererState
    get() = unsafeCast("gathering")

inline val RTCIceGathererState.Companion.new: RTCIceGathererState
    get() = unsafeCast("new")
