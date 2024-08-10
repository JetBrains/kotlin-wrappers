package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface PlainDateTimeISOFields {
    var isoYear: Int
    var isoMonth: Int
    var isoDay: Int
    var isoHour: Int
    var isoMinute: Int
    var isoSecond: Int
    var isoMillisecond: Int
    var isoMicrosecond: Int
    var isoNanosecond: Int
    var calendar: Any /* String | CalendarProtocol */
}
