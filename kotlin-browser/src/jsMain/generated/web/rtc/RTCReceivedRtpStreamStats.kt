// Automatically generated - do not modify!

package web.rtc

import js.core.JsLong
import js.objects.JsPlainObject

@JsPlainObject
sealed external interface RTCReceivedRtpStreamStats :
    RTCRtpStreamStats {
    var jitter: Double?
    var packetsLost: JsLong?
    var packetsReceived: JsLong?
}
