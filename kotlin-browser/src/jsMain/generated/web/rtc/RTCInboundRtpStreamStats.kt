// Automatically generated - do not modify!

package web.rtc

import js.core.JsLong
import kotlinx.js.JsPlainObject
import web.time.DOMHighResTimeStamp

@JsPlainObject
external interface RTCInboundRtpStreamStats :
    RTCReceivedRtpStreamStats {
    var audioLevel: Double?
    var bytesReceived: JsLong?
    var concealedSamples: JsLong?
    var concealmentEvents: JsLong?
    var decoderImplementation: String?
    var estimatedPlayoutTimestamp: DOMHighResTimeStamp?
    var fecPacketsDiscarded: JsLong?
    var fecPacketsReceived: JsLong?
    var firCount: Int?
    var frameHeight: Int?
    var frameWidth: Int?
    var framesDecoded: Int?
    var framesDropped: Int?
    var framesPerSecond: Double?
    var framesReceived: Int?
    var headerBytesReceived: JsLong?
    var insertedSamplesForDeceleration: JsLong?
    var jitterBufferDelay: Double?
    var jitterBufferEmittedCount: JsLong?
    var keyFramesDecoded: Int?
    var lastPacketReceivedTimestamp: DOMHighResTimeStamp?
    var mid: String?
    var nackCount: Int?
    var packetsDiscarded: JsLong?
    var pliCount: Int?
    var qpSum: JsLong?
    var remoteId: String?
    var removedSamplesForAcceleration: JsLong?
    var silentConcealedSamples: JsLong?
    var totalAudioEnergy: Double?
    var totalDecodeTime: Double?
    var totalInterFrameDelay: Double?
    var totalProcessingDelay: Double?
    var totalSamplesDuration: Double?
    var totalSamplesReceived: JsLong?
    var totalSquaredInterFrameDelay: Double?
    var trackIdentifier: String
}
