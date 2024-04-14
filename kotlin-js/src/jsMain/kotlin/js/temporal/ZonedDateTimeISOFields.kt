package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface ZonedDateTimeISOFields {
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
    var timeZone: Any /* string | TimeZoneProtocol */
    var calendar: Any /* string | CalendarProtocol */
}
