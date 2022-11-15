// Automatically generated - do not modify!

package webrtc

sealed external interface RTCInboundRtpStreamStats : RTCReceivedRtpStreamStats {
    var audioLevel: Number?
    var bytesReceived: Number?
    var concealedSamples: Number?
    var concealmentEvents: Number?
    var decoderImplementation: String?
    var estimatedPlayoutTimestamp: kotlinx.js.HighResTimeStamp?
    var fecPacketsDiscarded: Number?
    var fecPacketsReceived: Number?
    var firCount: Number?
    var frameHeight: Number?
    var frameWidth: Number?
    var framesDecoded: Number?
    var framesDropped: Number?
    var framesPerSecond: Number?
    var framesReceived: Number?
    var headerBytesReceived: Number?
    var insertedSamplesForDeceleration: Number?
    var jitterBufferDelay: Number?
    var jitterBufferEmittedCount: Number?
    var keyFramesDecoded: Number?
    override var kind: String
    var lastPacketReceivedTimestamp: kotlinx.js.HighResTimeStamp?
    var nackCount: Number?
    var packetsDiscarded: Number?
    var pliCount: Number?
    var qpSum: Number?
    var remoteId: String?
    var removedSamplesForAcceleration: Number?
    var silentConcealedSamples: Number?
    var totalAudioEnergy: Number?
    var totalDecodeTime: Number?
    var totalInterFrameDelay: Number?
    var totalProcessingDelay: Number?
    var totalSamplesDuration: Number?
    var totalSamplesReceived: Number?
    var totalSquaredInterFrameDelay: Number?
}
