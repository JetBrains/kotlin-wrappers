package js.temporal

import kotlinx.js.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface ZonedDateTimeISOFields {
    var isoYear: Int
    var isoMonth: Int
    var isoDay: Int
    var isoHour: Int
    var isoMinute: Int
    var isoSecond: Int
    var isoMillisecond: Int
    var isoMicrosecond: Int
    var isoNanosecond: Int
    var offset: String
    var timeZone: JsAny /* string | TimeZoneProtocol */
    var calendar: JsAny /* string | CalendarProtocol */
}
