// Automatically generated - do not modify!

package web.rtc

import js.core.JsDouble
import js.core.UInt53
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord
import kotlin.js.JsString

@JsPlainObject
external interface RTCOutboundRtpStreamStats :
    RTCSentRtpStreamStats {
    var active: Boolean?
    var firCount: Int?
    var frameHeight: Int?
    var frameWidth: Int?
    var framesEncoded: Int?
    var framesPerSecond: Double?
    var framesSent: Int?
    var headerBytesSent: UInt53?
    var hugeFramesSent: Int?
    var keyFramesEncoded: Int?
    var mediaSourceId: String?
    var mid: String?
    var nackCount: Int?
    var pliCount: Int?
    var qpSum: UInt53?
    var qualityLimitationDurations: ReadonlyRecord<JsString, JsDouble>?
    var qualityLimitationReason: RTCQualityLimitationReason?
    var qualityLimitationResolutionChanges: Int?
    var remoteId: String?
    var retransmittedBytesSent: UInt53?
    var retransmittedPacketsSent: UInt53?
    var rid: String?
    var rtxSsrc: Int?
    var scalabilityMode: String?
    var targetBitrate: Double?
    var totalEncodeTime: Double?
    var totalEncodedBytesTarget: UInt53?
    var totalPacketSendDelay: Double?
}
