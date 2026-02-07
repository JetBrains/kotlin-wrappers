// Automatically generated - do not modify!

package web.rtc

import js.core.UInt53
import kotlinx.js.JsPlainObject
import web.time.DOMHighResTimeStamp

@JsPlainObject
external interface RTCIceCandidatePairStats :
    RTCStats {
    var availableIncomingBitrate: Double?
    var availableOutgoingBitrate: Double?
    var bytesDiscardedOnSend: UInt53?
    var bytesReceived: UInt53?
    var bytesSent: UInt53?
    var consentRequestsSent: UInt53?
    var currentRoundTripTime: Double?
    var lastPacketReceivedTimestamp: DOMHighResTimeStamp?
    var lastPacketSentTimestamp: DOMHighResTimeStamp?
    var localCandidateId: String
    var nominated: Boolean?
    var packetsDiscardedOnSend: Int?
    var packetsReceived: UInt53?
    var packetsSent: UInt53?
    var remoteCandidateId: String
    var requestsReceived: UInt53?
    var requestsSent: UInt53?
    var responsesReceived: UInt53?
    var responsesSent: UInt53?
    var state: RTCStatsIceCandidatePairState
    var totalRoundTripTime: Double?
    var transportId: String
}
