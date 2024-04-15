package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface PlainDateISOFields {
    var isoYear: Int
    var isoMonth: Int
    var isoDay: Int
    var calendar: Any /* String | CalendarProtocol */
}
