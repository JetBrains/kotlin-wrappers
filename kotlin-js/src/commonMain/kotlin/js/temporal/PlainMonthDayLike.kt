package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface PlainMonthDayLike {

    val era: String?
    val eraYear: Int?
    val year: Int?
    val month: Int?
    val monthCode: String?
    val day: Int?
    val calendar: CalendarLike?
}
