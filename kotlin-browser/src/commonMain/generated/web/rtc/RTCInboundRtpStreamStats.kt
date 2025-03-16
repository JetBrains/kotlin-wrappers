// Automatically generated - do not modify!

package web.rtc

import js.core.UInt53
import js.objects.JsPlainObject
import web.time.DOMHighResTimeStamp

@JsPlainObject
external interface RTCInboundRtpStreamStats :
    RTCReceivedRtpStreamStats {
    val audioLevel: Double?
    val bytesReceived: UInt53?
    val concealedSamples: UInt53?
    val concealmentEvents: UInt53?
    val decoderImplementation: String?
    val estimatedPlayoutTimestamp: DOMHighResTimeStamp?
    val fecBytesReceived: UInt53?
    val fecPacketsDiscarded: UInt53?
    val fecPacketsReceived: UInt53?
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
    val headerBytesReceived: UInt53?
    val insertedSamplesForDeceleration: UInt53?
    val jitterBufferDelay: Double?
    val jitterBufferEmittedCount: UInt53?
    val jitterBufferMinimumDelay: Double?
    val jitterBufferTargetDelay: Double?
    val keyFramesDecoded: Int?
    val lastPacketReceivedTimestamp: DOMHighResTimeStamp?
    val mid: String?
    val nackCount: Int?
    val packetsDiscarded: UInt53?
    val pauseCount: Int?
    val playoutId: String?
    val pliCount: Int?
    val qpSum: UInt53?
    val remoteId: String?
    val removedSamplesForAcceleration: UInt53?
    val retransmittedBytesReceived: UInt53?
    val retransmittedPacketsReceived: UInt53?
    val rtxSsrc: Int?
    val silentConcealedSamples: UInt53?
    val totalAssemblyTime: Double?
    val totalAudioEnergy: Double?
    val totalDecodeTime: Double?
    val totalFreezesDuration: Double?
    val totalInterFrameDelay: Double?
    val totalPausesDuration: Double?
    val totalProcessingDelay: Double?
    val totalSamplesDuration: Double?
    val totalSamplesReceived: UInt53?
    val totalSquaredInterFrameDelay: Double?
    val trackIdentifier: String
}
