package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface PlainTimeLike {
    var hour: Int?
    var minute: Int?
    var second: Int?
    var millisecond: Int?
    var microsecond: Int?
    var nanosecond: Int?
}
