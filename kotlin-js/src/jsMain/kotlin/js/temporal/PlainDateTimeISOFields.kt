package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface PlainDateTimeISOFields {
    val isoYear: Int
    val isoMonth: Int
    val isoDay: Int
    val isoHour: Int
    val isoMinute: Int
    val isoSecond: Int
    val isoMillisecond: Int
    val isoMicrosecond: Int
    val isoNanosecond: Int
    val calendar: Any /* String | CalendarProtocol */
}
