// Automatically generated - do not modify!

package web.rtc

import js.core.JsLong
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface RTCReceivedRtpStreamStats :
    RTCRtpStreamStats {
    val jitter: Double?
    val packetsLost: JsLong?
    val packetsReceived: JsLong?
}
