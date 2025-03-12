package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface PlainTimeLike {

    var hour: Int?
    var minute: Int?
    var second: Int?
    var millisecond: Int?
    var microsecond: Int?
    var nanosecond: Int?
}
