package js.temporal

import js.core.JsAnyMarker
import js.objects.JsPlainObject

@JsPlainObject
external interface PlainTimeLike :
    JsAnyMarker {

    var hour: Int?
    var minute: Int?
    var second: Int?
    var millisecond: Int?
    var microsecond: Int?
    var nanosecond: Int?
}
