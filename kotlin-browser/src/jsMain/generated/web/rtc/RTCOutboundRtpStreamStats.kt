// Automatically generated - do not modify!

package web.rtc

import js.core.JsLong
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord

@JsPlainObject
external interface RTCOutboundRtpStreamStats :
    RTCSentRtpStreamStats {
    val active: Boolean?
    val firCount: UInt?
    val frameHeight: UInt?
    val frameWidth: UInt?
    val framesEncoded: UInt?
    val framesPerSecond: Double?
    val framesSent: UInt?
    val headerBytesSent: JsLong?
    val hugeFramesSent: UInt?
    val keyFramesEncoded: UInt?
    val mediaSourceId: String?
    val mid: String?
    val nackCount: UInt?
    val pliCount: UInt?
    val qpSum: JsLong?
    val qualityLimitationDurations: ReadonlyRecord<String, Double>?
    val qualityLimitationReason: RTCQualityLimitationReason?
    val qualityLimitationResolutionChanges: UInt?
    val remoteId: String?
    val retransmittedBytesSent: JsLong?
    val retransmittedPacketsSent: JsLong?
    val rid: String?
    val rtxSsrc: UInt?
    val scalabilityMode: String?
    val targetBitrate: Double?
    val totalEncodeTime: Double?
    val totalEncodedBytesTarget: JsLong?
    val totalPacketSendDelay: Double?
}
