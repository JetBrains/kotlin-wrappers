package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface PlainTimeISOFields {
    var isoHour: Int
    var isoMinute: Int
    var isoSecond: Int
    var isoMillisecond: Int
    var isoMicrosecond: Int
    var isoNanosecond: Int
}
