// Automatically generated - do not modify!

package web.rtc

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface RTCRtpStreamStats :
    RTCStats {
    var codecId: String?
    var kind: String
    var ssrc: Int
    var transportId: String?
}
