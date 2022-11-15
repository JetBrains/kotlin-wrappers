// Automatically generated - do not modify!

package webrtc

sealed external interface RTCIceCandidatePairStats : RTCStats {
    var availableIncomingBitrate: Number?
    var availableOutgoingBitrate: Number?
    var bytesReceived: Number?
    var bytesSent: Number?
    var currentRoundTripTime: Number?
    var lastPacketReceivedTimestamp: kotlinx.js.HighResTimeStamp?
    var lastPacketSentTimestamp: kotlinx.js.HighResTimeStamp?
    var localCandidateId: String
    var nominated: Boolean?
    var remoteCandidateId: String
    var requestsReceived: Number?
    var requestsSent: Number?
    var responsesReceived: Number?
    var responsesSent: Number?
    var state: RTCStatsIceCandidatePairState
    var totalRoundTripTime: Number?
    var transportId: String
}
