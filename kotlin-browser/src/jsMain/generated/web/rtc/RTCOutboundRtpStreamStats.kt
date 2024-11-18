// Automatically generated - do not modify!

package web.rtc

import js.core.JsLong
import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject

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
    val headerBytesSent: JsLong?
    val hugeFramesSent: Int?
    val keyFramesEncoded: Int?
    val mediaSourceId: String?
    val mid: String?
    val nackCount: Int?
    val pliCount: Int?
    val qpSum: JsLong?
    val qualityLimitationDurations: ReadonlyRecord<String, Double>?
    val qualityLimitationReason: RTCQualityLimitationReason?
    val qualityLimitationResolutionChanges: Int?
    val remoteId: String?
    val retransmittedBytesSent: JsLong?
    val retransmittedPacketsSent: JsLong?
    val rid: String?
    val rtxSsrc: Int?
    val scalabilityMode: String?
    val targetBitrate: Double?
    val totalEncodeTime: Double?
    val totalEncodedBytesTarget: JsLong?
    val totalPacketSendDelay: Double?
}
