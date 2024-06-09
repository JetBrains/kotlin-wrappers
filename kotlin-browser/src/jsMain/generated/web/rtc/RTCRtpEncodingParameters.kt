// Automatically generated - do not modify!

package web.rtc

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface RTCRtpEncodingParameters :
    RTCRtpCodingParameters {
    var active: Boolean?
    var maxBitrate: Int?
    var maxFramerate: Double?
    var networkPriority: RTCPriorityType?
    var priority: RTCPriorityType?
    var scaleResolutionDownBy: Double?
}
