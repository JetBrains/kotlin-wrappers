// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceGatheringState)
 */
@JsUnion
sealed /* union */
external interface RTCIceGatheringState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceGatheringState#complete)
 */
inline val RTCIceGatheringState.Companion.complete: RTCIceGatheringState
    get() = unsafeCast("complete")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceGatheringState#gathering)
 */
inline val RTCIceGatheringState.Companion.gathering: RTCIceGatheringState
    get() = unsafeCast("gathering")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceGatheringState#new)
 */
inline val RTCIceGatheringState.Companion.new: RTCIceGatheringState
    get() = unsafeCast("new")
