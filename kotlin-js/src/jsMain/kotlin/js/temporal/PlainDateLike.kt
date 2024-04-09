package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface PlainDateLike {
    var era: String?
    var eraYear: Int?
    var year: Int?
    var month: Int?
    var monthCode: String?
    var day: Int?
    var calendar: CalendarLike?
}
