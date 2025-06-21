package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface DurationLike {

    var years: Int?
    var months: Int?
    var weeks: Int?
    var days: Int?
    var hours: Int?
    var minutes: Int?
    var seconds: Int?
    var milliseconds: Int?
    var microseconds: Int?
    var nanoseconds: Int?
}
