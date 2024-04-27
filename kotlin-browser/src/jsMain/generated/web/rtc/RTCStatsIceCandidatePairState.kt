// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
