// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCStatsIceCandidatePairState {
    companion object
}

inline val RTCStatsIceCandidatePairState.Companion.failed: RTCStatsIceCandidatePairState
    get() = unsafeCast("failed")

inline val RTCStatsIceCandidatePairState.Companion.frozen: RTCStatsIceCandidatePairState
    get() = unsafeCast("frozen")

inline val RTCStatsIceCandidatePairState.Companion.inProgress: RTCStatsIceCandidatePairState
    get() = unsafeCast("inProgress")

inline val RTCStatsIceCandidatePairState.Companion.inprogress: RTCStatsIceCandidatePairState
    get() = unsafeCast("inprogress")

inline val RTCStatsIceCandidatePairState.Companion.succeeded: RTCStatsIceCandidatePairState
    get() = unsafeCast("succeeded")

inline val RTCStatsIceCandidatePairState.Companion.waiting: RTCStatsIceCandidatePairState
    get() = unsafeCast("waiting")
