// Automatically generated - do not modify!

package webrtc

sealed external interface RTCOutboundRtpStreamStats :
    RTCSentRtpStreamStats {
    var firCount: Int?
    var frameHeight: Number?
    var frameWidth: Number?
    var framesEncoded: Number?
    var framesPerSecond: Number?
    var framesSent: Number?
    var headerBytesSent: Number?
    var hugeFramesSent: Number?
    var keyFramesEncoded: Number?
    var mediaSourceId: String?
    var nackCount: Int?
    var pliCount: Int?
    var qpSum: Number?
    var qualityLimitationResolutionChanges: Number?
    var remoteId: String?
    var retransmittedBytesSent: Number?
    var retransmittedPacketsSent: Number?
    var rid: String?
    var targetBitrate: Number?
    var totalEncodeTime: Number?
    var totalEncodedBytesTarget: Number?
    var totalPacketSendDelay: Number?
}
