package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface PlainYearMonthLike {
    var era: String?
    var eraYear: Int?
    var year: Int?
    var month: Int?
    var monthCode: String?
    var calendar: CalendarLike?
}
