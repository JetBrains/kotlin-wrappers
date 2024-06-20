// Automatically generated - do not modify!

package web.rtc

import js.core.JsLong
import kotlinx.js.JsPlainObject
import web.time.DOMHighResTimeStamp

@JsPlainObject
external interface RTCIceCandidatePairStats :
    RTCStats {
    var availableIncomingBitrate: Double?
    var availableOutgoingBitrate: Double?
    var bytesReceived: JsLong?
    var bytesSent: JsLong?
    var currentRoundTripTime: Double?
    var lastPacketReceivedTimestamp: DOMHighResTimeStamp?
    var lastPacketSentTimestamp: DOMHighResTimeStamp?
    var localCandidateId: String
    var nominated: Boolean?
    var remoteCandidateId: String
    var requestsReceived: JsLong?
    var requestsSent: JsLong?
    var responsesReceived: JsLong?
    var responsesSent: JsLong?
    var state: RTCStatsIceCandidatePairState
    var totalRoundTripTime: Double?
    var transportId: String
}
