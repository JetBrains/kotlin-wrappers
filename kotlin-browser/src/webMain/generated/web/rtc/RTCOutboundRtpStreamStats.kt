// Automatically generated - do not modify!

package web.rtc

import js.numbers.JsDouble
import js.numbers.UInt53
import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats)
 */
@JsPlainObject
external interface RTCOutboundRtpStreamStats :
    RTCSentRtpStreamStats {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/active)
     */
    var active: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/firCount)
     */
    var firCount: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/frameHeight)
     */
    var frameHeight: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/frameWidth)
     */
    var frameWidth: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/framesEncoded)
     */
    var framesEncoded: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/framesPerSecond)
     */
    var framesPerSecond: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/framesSent)
     */
    var framesSent: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/headerBytesSent)
     */
    var headerBytesSent: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/hugeFramesSent)
     */
    var hugeFramesSent: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/keyFramesEncoded)
     */
    var keyFramesEncoded: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/mediaSourceId)
     */
    var mediaSourceId: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/mid)
     */
    var mid: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/nackCount)
     */
    var nackCount: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/pliCount)
     */
    var pliCount: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/qpSum)
     */
    var qpSum: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/qualityLimitationDurations)
     */
    var qualityLimitationDurations: ReadonlyRecord<JsString, JsDouble>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/qualityLimitationReason)
     */
    var qualityLimitationReason: RTCQualityLimitationReason?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/qualityLimitationResolutionChanges)
     */
    var qualityLimitationResolutionChanges: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/remoteId)
     */
    var remoteId: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/retransmittedBytesSent)
     */
    var retransmittedBytesSent: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/retransmittedPacketsSent)
     */
    var retransmittedPacketsSent: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/rid)
     */
    var rid: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/rtxSsrc)
     */
    var rtxSsrc: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/scalabilityMode)
     */
    var scalabilityMode: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/targetBitrate)
     */
    var targetBitrate: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/totalEncodeTime)
     */
    var totalEncodeTime: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/totalEncodedBytesTarget)
     */
    var totalEncodedBytesTarget: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/totalPacketSendDelay)
     */
    var totalPacketSendDelay: Double?
}
