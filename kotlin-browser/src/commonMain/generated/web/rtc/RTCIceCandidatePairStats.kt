// Automatically generated - do not modify!

package web.rtc

import js.core.UInt53
import js.objects.JsPlainObject
import web.time.DOMHighResTimeStamp

@JsPlainObject
external interface RTCIceCandidatePairStats :
    RTCStats {
    val availableIncomingBitrate: Double?
    val availableOutgoingBitrate: Double?
    val bytesDiscardedOnSend: UInt53?
    val bytesReceived: UInt53?
    val bytesSent: UInt53?
    val consentRequestsSent: UInt53?
    val currentRoundTripTime: Double?
    val lastPacketReceivedTimestamp: DOMHighResTimeStamp?
    val lastPacketSentTimestamp: DOMHighResTimeStamp?
    val localCandidateId: String
    val nominated: Boolean?
    val packetsDiscardedOnSend: Int?
    val packetsReceived: UInt53?
    val packetsSent: UInt53?
    val remoteCandidateId: String
    val requestsReceived: UInt53?
    val requestsSent: UInt53?
    val responsesReceived: UInt53?
    val responsesSent: UInt53?
    val state: RTCStatsIceCandidatePairState
    val totalRoundTripTime: Double?
    val transportId: String
}
