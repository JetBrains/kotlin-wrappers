// Automatically generated - do not modify!

package web.rtc

import js.core.Int53
import js.objects.JsPlainObject
import web.time.DOMHighResTimeStamp

@JsPlainObject
external interface RTCIceCandidatePairStats :
    RTCStats {
    val availableIncomingBitrate: Double?
    val availableOutgoingBitrate: Double?
    val bytesDiscardedOnSend: Int53?
    val bytesReceived: Int53?
    val bytesSent: Int53?
    val consentRequestsSent: Int53?
    val currentRoundTripTime: Double?
    val lastPacketReceivedTimestamp: DOMHighResTimeStamp?
    val lastPacketSentTimestamp: DOMHighResTimeStamp?
    val localCandidateId: String
    val nominated: Boolean?
    val packetsDiscardedOnSend: Int?
    val packetsReceived: Int53?
    val packetsSent: Int53?
    val remoteCandidateId: String
    val requestsReceived: Int53?
    val requestsSent: Int53?
    val responsesReceived: Int53?
    val responsesSent: Int53?
    val state: RTCStatsIceCandidatePairState
    val totalRoundTripTime: Double?
    val transportId: String
}
