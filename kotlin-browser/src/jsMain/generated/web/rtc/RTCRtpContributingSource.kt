// Automatically generated - do not modify!

package web.rtc

import js.objects.JsPlainObject
import web.time.DOMHighResTimeStamp

@JsPlainObject
sealed external interface RTCRtpContributingSource {
    var audioLevel: Double?
    var rtpTimestamp: Int
    var source: Int
    var timestamp: DOMHighResTimeStamp
}
