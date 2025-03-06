package js.temporal

import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface PlainDateISOFields {
    val isoYear: Int
    val isoMonth: Int
    val isoDay: Int
    val calendar: JsAny /* String | CalendarProtocol */
}
