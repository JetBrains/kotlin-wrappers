// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/state)
 */
@JsUnion
sealed /* union */
external interface RTCStatsIceCandidatePairState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/state#failed)
 */
inline val RTCStatsIceCandidatePairState.Companion.failed: RTCStatsIceCandidatePairState
    get() = unsafeCast("failed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/state#frozen)
 */
inline val RTCStatsIceCandidatePairState.Companion.frozen: RTCStatsIceCandidatePairState
    get() = unsafeCast("frozen")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/state#in-progress)
 */
inline val RTCStatsIceCandidatePairState.Companion.inProgress: RTCStatsIceCandidatePairState
    get() = unsafeCast("in-progress")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/state#succeeded)
 */
inline val RTCStatsIceCandidatePairState.Companion.succeeded: RTCStatsIceCandidatePairState
    get() = unsafeCast("succeeded")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/state#waiting)
 */
inline val RTCStatsIceCandidatePairState.Companion.waiting: RTCStatsIceCandidatePairState
    get() = unsafeCast("waiting")
