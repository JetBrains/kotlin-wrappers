// Automatically generated - do not modify!

package web.rtc

import js.core.UInt53
import js.objects.JsPlainObject
import web.time.DOMHighResTimeStamp

@JsPlainObject
external interface RTCInboundRtpStreamStats :
    RTCReceivedRtpStreamStats {
    var audioLevel: Double?
    var bytesReceived: UInt53?
    var concealedSamples: UInt53?
    var concealmentEvents: UInt53?
    var decoderImplementation: String?
    var estimatedPlayoutTimestamp: DOMHighResTimeStamp?
    var fecBytesReceived: UInt53?
    var fecPacketsDiscarded: UInt53?
    var fecPacketsReceived: UInt53?
    var fecSsrc: Int?
    var firCount: Int?
    var frameHeight: Int?
    var frameWidth: Int?
    var framesAssembledFromMultiplePackets: Int?
    var framesDecoded: Int?
    var framesDropped: Int?
    var framesPerSecond: Double?
    var framesReceived: Int?
    var framesRendered: Int?
    var freezeCount: Int?
    var headerBytesReceived: UInt53?
    var insertedSamplesForDeceleration: UInt53?
    var jitterBufferDelay: Double?
    var jitterBufferEmittedCount: UInt53?
    var jitterBufferMinimumDelay: Double?
    var jitterBufferTargetDelay: Double?
    var keyFramesDecoded: Int?
    var lastPacketReceivedTimestamp: DOMHighResTimeStamp?
    var mid: String?
    var nackCount: Int?
    var packetsDiscarded: UInt53?
    var pauseCount: Int?
    var playoutId: String?
    var pliCount: Int?
    var qpSum: UInt53?
    var remoteId: String?
    var removedSamplesForAcceleration: UInt53?
    var retransmittedBytesReceived: UInt53?
    var retransmittedPacketsReceived: UInt53?
    var rtxSsrc: Int?
    var silentConcealedSamples: UInt53?
    var totalAssemblyTime: Double?
    var totalAudioEnergy: Double?
    var totalDecodeTime: Double?
    var totalFreezesDuration: Double?
    var totalInterFrameDelay: Double?
    var totalPausesDuration: Double?
    var totalProcessingDelay: Double?
    var totalSamplesDuration: Double?
    var totalSamplesReceived: UInt53?
    var totalSquaredInterFrameDelay: Double?
    var trackIdentifier: String
}
