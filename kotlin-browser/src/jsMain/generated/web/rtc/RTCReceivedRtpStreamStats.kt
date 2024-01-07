// Automatically generated - do not modify!

package web.rtc

import js.core.JsLong

sealed external interface RTCReceivedRtpStreamStats :
    RTCRtpStreamStats {
    var jitter: Double?
    var packetsLost: JsLong?
    var packetsReceived: JsLong?
}
