package js.temporal

import js.objects.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface PlainDateTimeISOFields {
    var isoYear: Int
    var isoMonth: Int
    var isoDay: Int
    var isoHour: Int
    var isoMinute: Int
    var isoSecond: Int
    var isoMillisecond: Int
    var isoMicrosecond: Int
    var isoNanosecond: Int
    var calendar: JsAny /* String | CalendarProtocol */
}
