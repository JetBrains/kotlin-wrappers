// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCIceGatheringState

inline val RTCIceGatheringState.Companion.complete: RTCIceGatheringState
    get() = unsafeCast("complete")

inline val RTCIceGatheringState.Companion.gathering: RTCIceGatheringState
    get() = unsafeCast("gathering")

inline val RTCIceGatheringState.Companion.new: RTCIceGatheringState
    get() = unsafeCast("new")
