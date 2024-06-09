// Automatically generated - do not modify!

package web.rtc

import kotlinx.js.JsPlainObject
import web.time.DOMHighResTimeStamp

@JsPlainObject
sealed external interface RTCStats {
    var id: String
    var timestamp: DOMHighResTimeStamp
    var type: RTCStatsType
}
