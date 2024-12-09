package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface PlainDateISOFields {
    val isoYear: Int
    val isoMonth: Int
    val isoDay: Int
    val calendar: Any /* String | CalendarProtocol */
}
