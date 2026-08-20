// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/gatheringState)
 */
@JsUnion
sealed /* union */
external interface RTCIceGathererState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/gatheringState#complete)
 */
inline val RTCIceGathererState.Companion.complete: RTCIceGathererState
    get() = unsafeCast("complete")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/gatheringState#gathering)
 */
inline val RTCIceGathererState.Companion.gathering: RTCIceGathererState
    get() = unsafeCast("gathering")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/gatheringState#new)
 */
inline val RTCIceGathererState.Companion.new: RTCIceGathererState
    get() = unsafeCast("new")
