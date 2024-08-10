package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface ZonedDateTimeLike {
    var era: String?
    var eraYear: Int?
    var year: Int?
    var month: Int?
    var monthCode: String?
    var day: Int?
    var hour: Int?
    var minute: Int?
    var second: Int?
    var millisecond: Int?
    var microsecond: Int?
    var nanosecond: Int?
    var offset: String?
    var timeZone: TimeZoneLike?
    var calendar: CalendarLike?
}
