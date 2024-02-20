// Automatically generated - do not modify!

package web.rtc

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface RTCRtpStreamStats :
    RTCStats {
    var codecId: String?
    var kind: String
    var ssrc: Int
    var transportId: String?
}
