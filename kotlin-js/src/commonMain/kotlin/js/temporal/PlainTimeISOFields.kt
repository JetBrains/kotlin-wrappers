package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface PlainTimeISOFields {
    val isoHour: Int
    val isoMinute: Int
    val isoSecond: Int
    val isoMillisecond: Int
    val isoMicrosecond: Int
    val isoNanosecond: Int
}
