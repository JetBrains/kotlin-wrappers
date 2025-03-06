@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package js.temporal

import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface PlainYearMonthLike :
    JsAny {

    val era: String?
    val eraYear: Int?
    val year: Int?
    val month: Int?
    val monthCode: String?
    val calendar: CalendarLike?
}
