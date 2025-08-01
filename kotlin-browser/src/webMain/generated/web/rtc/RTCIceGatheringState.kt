// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCIceGatheringState {
    companion object
}

inline val RTCIceGatheringState.Companion.complete: RTCIceGatheringState
    get() = unsafeCast("complete")

inline val RTCIceGatheringState.Companion.gathering: RTCIceGatheringState
    get() = unsafeCast("gathering")

inline val RTCIceGatheringState.Companion.new: RTCIceGatheringState
    get() = unsafeCast("new")
