// Automatically generated - do not modify!

package web.rtc

import js.core.JsLong

sealed external interface RTCOutboundRtpStreamStats :
    RTCSentRtpStreamStats {
    var firCount: Int?
    var frameHeight: Int?
    var frameWidth: Int?
    var framesEncoded: Int?
    var framesPerSecond: Double?
    var framesSent: Int?
    var headerBytesSent: JsLong?
    var hugeFramesSent: Int?
    var keyFramesEncoded: Int?
    var mediaSourceId: String?
    var nackCount: Int?
    var pliCount: Int?
    var qpSum: JsLong?
    var qualityLimitationResolutionChanges: Int?
    var remoteId: String?
    var retransmittedBytesSent: JsLong?
    var retransmittedPacketsSent: JsLong?
    var rid: String?
    var rtxSsrc: Int?
    var targetBitrate: Double?
    var totalEncodeTime: Double?
    var totalEncodedBytesTarget: JsLong?
    var totalPacketSendDelay: Double?
}
