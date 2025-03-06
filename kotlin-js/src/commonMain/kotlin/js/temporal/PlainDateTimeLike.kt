@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package js.temporal

import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface PlainDateTimeLike :
    JsAny {

    val era: String?
    val eraYear: Int?
    val year: Int?
    val month: Int?
    val monthCode: String?
    val day: Int?
    val hour: Int?
    val minute: Int?
    val second: Int?
    val millisecond: Int?
    val microsecond: Int?
    val nanosecond: Int?
    val calendar: CalendarLike?
}
