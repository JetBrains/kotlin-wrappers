// Automatically generated - do not modify!

package web.rtc

import js.numbers.UInt53
import kotlinx.js.JsPlainObject
import web.time.DOMHighResTimeStamp

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats)
 */
@JsPlainObject
external interface RTCInboundRtpStreamStats :
    RTCReceivedRtpStreamStats {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/audioLevel)
     */
    var audioLevel: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/bytesReceived)
     */
    var bytesReceived: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/concealedSamples)
     */
    var concealedSamples: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/concealmentEvents)
     */
    var concealmentEvents: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/decoderImplementation)
     */
    var decoderImplementation: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/estimatedPlayoutTimestamp)
     */
    var estimatedPlayoutTimestamp: DOMHighResTimeStamp?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/fecBytesReceived)
     */
    var fecBytesReceived: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/fecPacketsDiscarded)
     */
    var fecPacketsDiscarded: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/fecPacketsReceived)
     */
    var fecPacketsReceived: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/fecSsrc)
     */
    var fecSsrc: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/firCount)
     */
    var firCount: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/frameHeight)
     */
    var frameHeight: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/frameWidth)
     */
    var frameWidth: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/framesAssembledFromMultiplePackets)
     */
    var framesAssembledFromMultiplePackets: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/framesDecoded)
     */
    var framesDecoded: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/framesDropped)
     */
    var framesDropped: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/framesPerSecond)
     */
    var framesPerSecond: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/framesReceived)
     */
    var framesReceived: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/framesRendered)
     */
    var framesRendered: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/freezeCount)
     */
    var freezeCount: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/headerBytesReceived)
     */
    var headerBytesReceived: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/insertedSamplesForDeceleration)
     */
    var insertedSamplesForDeceleration: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/jitterBufferDelay)
     */
    var jitterBufferDelay: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/jitterBufferEmittedCount)
     */
    var jitterBufferEmittedCount: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/jitterBufferMinimumDelay)
     */
    var jitterBufferMinimumDelay: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/jitterBufferTargetDelay)
     */
    var jitterBufferTargetDelay: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/keyFramesDecoded)
     */
    var keyFramesDecoded: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/lastPacketReceivedTimestamp)
     */
    var lastPacketReceivedTimestamp: DOMHighResTimeStamp?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/mid)
     */
    var mid: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/nackCount)
     */
    var nackCount: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/packetsDiscarded)
     */
    var packetsDiscarded: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/pauseCount)
     */
    var pauseCount: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/playoutId)
     */
    var playoutId: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/pliCount)
     */
    var pliCount: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/qpSum)
     */
    var qpSum: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/remoteId)
     */
    var remoteId: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/removedSamplesForAcceleration)
     */
    var removedSamplesForAcceleration: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/retransmittedBytesReceived)
     */
    var retransmittedBytesReceived: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/retransmittedPacketsReceived)
     */
    var retransmittedPacketsReceived: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/rtxSsrc)
     */
    var rtxSsrc: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/silentConcealedSamples)
     */
    var silentConcealedSamples: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/totalAssemblyTime)
     */
    var totalAssemblyTime: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/totalAudioEnergy)
     */
    var totalAudioEnergy: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/totalDecodeTime)
     */
    var totalDecodeTime: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/totalFreezesDuration)
     */
    var totalFreezesDuration: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/totalInterFrameDelay)
     */
    var totalInterFrameDelay: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/totalPausesDuration)
     */
    var totalPausesDuration: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/totalProcessingDelay)
     */
    var totalProcessingDelay: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/totalSamplesDuration)
     */
    var totalSamplesDuration: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/totalSamplesReceived)
     */
    var totalSamplesReceived: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/totalSquaredInterFrameDelay)
     */
    var totalSquaredInterFrameDelay: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCInboundRtpStreamStats/trackIdentifier)
     */
    var trackIdentifier: String
}
