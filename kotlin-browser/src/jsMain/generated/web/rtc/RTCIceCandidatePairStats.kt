// Automatically generated - do not modify!

package web.rtc

import js.core.JsLong
import kotlinx.js.JsPlainObject
import web.time.DOMHighResTimeStamp

@JsPlainObject
external interface RTCIceCandidatePairStats :
    RTCStats {
    val availableIncomingBitrate: Double?
    val availableOutgoingBitrate: Double?
    val bytesReceived: JsLong?
    val bytesSent: JsLong?
    val currentRoundTripTime: Double?
    val lastPacketReceivedTimestamp: DOMHighResTimeStamp?
    val lastPacketSentTimestamp: DOMHighResTimeStamp?
    val localCandidateId: String
    val nominated: Boolean?
    val remoteCandidateId: String
    val requestsReceived: JsLong?
    val requestsSent: JsLong?
    val responsesReceived: JsLong?
    val responsesSent: JsLong?
    val state: RTCStatsIceCandidatePairState
    val totalRoundTripTime: Double?
    val transportId: String
}
