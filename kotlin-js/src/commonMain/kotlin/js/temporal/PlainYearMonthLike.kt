package js.temporal

import js.core.JsAnyMarker
import js.objects.JsPlainObject

@JsPlainObject
external interface PlainYearMonthLike :
    JsAnyMarker {

    val era: String?
    val eraYear: Int?
    val year: Int?
    val month: Int?
    val monthCode: String?
    val calendar: CalendarLike?
}
