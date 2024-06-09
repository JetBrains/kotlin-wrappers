// Automatically generated - do not modify!

package web.rtc

import kotlinx.js.JsPlainObject
import web.time.DOMHighResTimeStamp

@JsPlainObject
sealed external interface RTCRtpContributingSource {
    var audioLevel: Double?
    var rtpTimestamp: Int
    var source: Int
    var timestamp: DOMHighResTimeStamp
}
