// Automatically generated - do not modify!

package web.rtc

import js.core.JsLong
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface RTCOutboundRtpStreamStats :
    RTCSentRtpStreamStats {
    val firCount: Int?
    val frameHeight: Int?
    val frameWidth: Int?
    val framesEncoded: Int?
    val framesPerSecond: Double?
    val framesSent: Int?
    val headerBytesSent: JsLong?
    val hugeFramesSent: Int?
    val keyFramesEncoded: Int?
    val mediaSourceId: String?
    val nackCount: Int?
    val pliCount: Int?
    val qpSum: JsLong?
    val qualityLimitationResolutionChanges: Int?
    val remoteId: String?
    val retransmittedBytesSent: JsLong?
    val retransmittedPacketsSent: JsLong?
    val rid: String?
    val rtxSsrc: Int?
    val targetBitrate: Double?
    val totalEncodeTime: Double?
    val totalEncodedBytesTarget: JsLong?
    val totalPacketSendDelay: Double?
}
