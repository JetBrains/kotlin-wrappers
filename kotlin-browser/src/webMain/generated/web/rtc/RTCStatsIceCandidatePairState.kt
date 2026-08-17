// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCStatsIceCandidatePairState

inline val RTCStatsIceCandidatePairState.Companion.failed: RTCStatsIceCandidatePairState
    get() = unsafeCast("failed")

inline val RTCStatsIceCandidatePairState.Companion.frozen: RTCStatsIceCandidatePairState
    get() = unsafeCast("frozen")

inline val RTCStatsIceCandidatePairState.Companion.inProgress: RTCStatsIceCandidatePairState
    get() = unsafeCast("in-progress")

inline val RTCStatsIceCandidatePairState.Companion.succeeded: RTCStatsIceCandidatePairState
    get() = unsafeCast("succeeded")

inline val RTCStatsIceCandidatePairState.Companion.waiting: RTCStatsIceCandidatePairState
    get() = unsafeCast("waiting")
