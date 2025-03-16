// Automatically generated - do not modify!

package web.rtc

import js.core.Int53
import js.objects.JsPlainObject
import web.time.DOMHighResTimeStamp

@JsPlainObject
external interface RTCInboundRtpStreamStats :
    RTCReceivedRtpStreamStats {
    val audioLevel: Double?
    val bytesReceived: Int53?
    val concealedSamples: Int53?
    val concealmentEvents: Int53?
    val decoderImplementation: String?
    val estimatedPlayoutTimestamp: DOMHighResTimeStamp?
    val fecBytesReceived: Int53?
    val fecPacketsDiscarded: Int53?
    val fecPacketsReceived: Int53?
    val fecSsrc: Int?
    val firCount: Int?
    val frameHeight: Int?
    val frameWidth: Int?
    val framesAssembledFromMultiplePackets: Int?
    val framesDecoded: Int?
    val framesDropped: Int?
    val framesPerSecond: Double?
    val framesReceived: Int?
    val framesRendered: Int?
    val freezeCount: Int?
    val headerBytesReceived: Int53?
    val insertedSamplesForDeceleration: Int53?
    val jitterBufferDelay: Double?
    val jitterBufferEmittedCount: Int53?
    val jitterBufferMinimumDelay: Double?
    val jitterBufferTargetDelay: Double?
    val keyFramesDecoded: Int?
    val lastPacketReceivedTimestamp: DOMHighResTimeStamp?
    val mid: String?
    val nackCount: Int?
    val packetsDiscarded: Int53?
    val pauseCount: Int?
    val playoutId: String?
    val pliCount: Int?
    val qpSum: Int53?
    val remoteId: String?
    val removedSamplesForAcceleration: Int53?
    val retransmittedBytesReceived: Int53?
    val retransmittedPacketsReceived: Int53?
    val rtxSsrc: Int?
    val silentConcealedSamples: Int53?
    val totalAssemblyTime: Double?
    val totalAudioEnergy: Double?
    val totalDecodeTime: Double?
    val totalFreezesDuration: Double?
    val totalInterFrameDelay: Double?
    val totalPausesDuration: Double?
    val totalProcessingDelay: Double?
    val totalSamplesDuration: Double?
    val totalSamplesReceived: Int53?
    val totalSquaredInterFrameDelay: Double?
    val trackIdentifier: String
}
