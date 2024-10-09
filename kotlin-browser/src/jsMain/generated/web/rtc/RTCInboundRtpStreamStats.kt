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
    val fecPacketsDiscarded: JsLong?
    val fecPacketsReceived: JsLong?
    val firCount: Int?
    val frameHeight: Int?
    val frameWidth: Int?
    val framesDecoded: Int?
    val framesDropped: Int?
    val framesPerSecond: Double?
    val framesReceived: Int?
    val headerBytesReceived: JsLong?
    val insertedSamplesForDeceleration: JsLong?
    val jitterBufferDelay: Double?
    val jitterBufferEmittedCount: JsLong?
    val keyFramesDecoded: Int?
    val lastPacketReceivedTimestamp: DOMHighResTimeStamp?
    val mid: String?
    val nackCount: Int?
    val packetsDiscarded: JsLong?
    val pliCount: Int?
    val qpSum: JsLong?
    val remoteId: String?
    val removedSamplesForAcceleration: JsLong?
    val silentConcealedSamples: JsLong?
    val totalAudioEnergy: Double?
    val totalDecodeTime: Double?
    val totalInterFrameDelay: Double?
    val totalProcessingDelay: Double?
    val totalSamplesDuration: Double?
    val totalSamplesReceived: JsLong?
    val totalSquaredInterFrameDelay: Double?
    val trackIdentifier: String
}
