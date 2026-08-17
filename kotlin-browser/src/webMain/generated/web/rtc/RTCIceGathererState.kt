// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCIceGathererState

inline val RTCIceGathererState.Companion.complete: RTCIceGathererState
    get() = unsafeCast("complete")

inline val RTCIceGathererState.Companion.gathering: RTCIceGathererState
    get() = unsafeCast("gathering")

inline val RTCIceGathererState.Companion.new: RTCIceGathererState
    get() = unsafeCast("new")
