// Automatically generated - do not modify!

package web.rtc

import js.core.JsLong
import js.objects.JsPlainObject
import web.time.DOMHighResTimeStamp

@JsPlainObject
external interface RTCInboundRtpStreamStats :
    RTCReceivedRtpStreamStats {
    val audioLevel: Double?
    val bytesReceived: JsLong?
    val concealedSamples: JsLong?
    val concealmentEvents: JsLong?
    val decoderImplementation: String?
    val estimatedPlayoutTimestamp: DOMHighResTimeStamp?
    val fecBytesReceived: JsLong?
    val fecPacketsDiscarded: JsLong?
    val fecPacketsReceived: JsLong?
    val fecSsrc: UInt?
    val firCount: UInt?
    val frameHeight: UInt?
    val frameWidth: UInt?
    val framesAssembledFromMultiplePackets: UInt?
    val framesDecoded: UInt?
    val framesDropped: UInt?
    val framesPerSecond: Double?
    val framesReceived: UInt?
    val framesRendered: UInt?
    val freezeCount: UInt?
    val headerBytesReceived: JsLong?
    val insertedSamplesForDeceleration: JsLong?
    val jitterBufferDelay: Double?
    val jitterBufferEmittedCount: JsLong?
    val jitterBufferMinimumDelay: Double?
    val jitterBufferTargetDelay: Double?
    val keyFramesDecoded: UInt?
    val lastPacketReceivedTimestamp: DOMHighResTimeStamp?
    val mid: String?
    val nackCount: UInt?
    val packetsDiscarded: JsLong?
    val pauseCount: UInt?
    val playoutId: String?
    val pliCount: UInt?
    val qpSum: JsLong?
    val remoteId: String?
    val removedSamplesForAcceleration: JsLong?
    val retransmittedBytesReceived: JsLong?
    val retransmittedPacketsReceived: JsLong?
    val rtxSsrc: UInt?
    val silentConcealedSamples: JsLong?
    val totalAssemblyTime: Double?
    val totalAudioEnergy: Double?
    val totalDecodeTime: Double?
    val totalFreezesDuration: Double?
    val totalInterFrameDelay: Double?
    val totalPausesDuration: Double?
    val totalProcessingDelay: Double?
    val totalSamplesDuration: Double?
    val totalSamplesReceived: JsLong?
    val totalSquaredInterFrameDelay: Double?
    val trackIdentifier: String
}
