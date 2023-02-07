// Automatically generated - do not modify!

package webrtc

import js.core.HighResTimeStamp

sealed external interface RTCInboundRtpStreamStats :
    RTCReceivedRtpStreamStats {
    var audioLevel: Number?
    var bytesReceived: Number?
    var concealedSamples: Number?
    var concealmentEvents: Number?
    var decoderImplementation: String?
    var estimatedPlayoutTimestamp: HighResTimeStamp?
    var fecPacketsDiscarded: Number?
    var fecPacketsReceived: Number?
    var firCount: Int?
    var frameHeight: Number?
    var frameWidth: Number?
    var framesDecoded: Number?
    var framesDropped: Number?
    var framesPerSecond: Number?
    var framesReceived: Number?
    var headerBytesReceived: Number?
    var insertedSamplesForDeceleration: Number?
    var jitterBufferDelay: Number?
    var jitterBufferEmittedCount: Int?
    var keyFramesDecoded: Number?
    override var kind: String
    var lastPacketReceivedTimestamp: HighResTimeStamp?
    var nackCount: Int?
    var packetsDiscarded: Number?
    var pliCount: Int?
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
