// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.rtc

import seskar.js.JsValue

sealed external interface RTCStatsIceCandidatePairState {
    companion object {
        @JsValue("failed")
        val failed: RTCStatsIceCandidatePairState

        @JsValue("frozen")
        val frozen: RTCStatsIceCandidatePairState

        @JsValue("in-progress")
        val inProgress: RTCStatsIceCandidatePairState

        @JsValue("inprogress")
        val inprogress: RTCStatsIceCandidatePairState

        @JsValue("succeeded")
        val succeeded: RTCStatsIceCandidatePairState

        @JsValue("waiting")
        val waiting: RTCStatsIceCandidatePairState
    }
}
