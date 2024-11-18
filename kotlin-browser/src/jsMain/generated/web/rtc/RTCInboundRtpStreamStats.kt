// Automatically generated - do not modify!

package web.rtc

import js.core.JsLong
import kotlinx.js.JsPlainObject
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
    val headerBytesReceived: JsLong?
    val insertedSamplesForDeceleration: JsLong?
    val jitterBufferDelay: Double?
    val jitterBufferEmittedCount: JsLong?
    val jitterBufferMinimumDelay: Double?
    val jitterBufferTargetDelay: Double?
    val keyFramesDecoded: Int?
    val lastPacketReceivedTimestamp: DOMHighResTimeStamp?
    val mid: String?
    val nackCount: Int?
    val packetsDiscarded: JsLong?
    val pauseCount: Int?
    val playoutId: String?
    val pliCount: Int?
    val qpSum: JsLong?
    val remoteId: String?
    val removedSamplesForAcceleration: JsLong?
    val retransmittedBytesReceived: JsLong?
    val retransmittedPacketsReceived: JsLong?
    val rtxSsrc: Int?
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
