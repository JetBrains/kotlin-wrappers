// Automatically generated - do not modify!

package web.rtc

import js.core.JsDouble
import js.core.JsString
import js.core.UInt53
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord

@JsPlainObject
external interface RTCOutboundRtpStreamStats :
    RTCSentRtpStreamStats {
    val active: Boolean?
    val firCount: Int?
    val frameHeight: Int?
    val frameWidth: Int?
    val framesEncoded: Int?
    val framesPerSecond: Double?
    val framesSent: Int?
    val headerBytesSent: UInt53?
    val hugeFramesSent: Int?
    val keyFramesEncoded: Int?
    val mediaSourceId: String?
    val mid: String?
    val nackCount: Int?
    val pliCount: Int?
    val qpSum: UInt53?
    val qualityLimitationDurations: ReadonlyRecord<JsString, JsDouble>?
    val qualityLimitationReason: RTCQualityLimitationReason?
    val qualityLimitationResolutionChanges: Int?
    val remoteId: String?
    val retransmittedBytesSent: UInt53?
    val retransmittedPacketsSent: UInt53?
    val rid: String?
    val rtxSsrc: Int?
    val scalabilityMode: String?
    val targetBitrate: Double?
    val totalEncodeTime: Double?
    val totalEncodedBytesTarget: UInt53?
    val totalPacketSendDelay: Double?
}
