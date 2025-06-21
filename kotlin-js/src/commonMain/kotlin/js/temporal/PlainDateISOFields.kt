package js.temporal

import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface PlainDateISOFields {
    var isoYear: Int
    var isoMonth: Int
    var isoDay: Int
    var calendar: JsAny /* String | CalendarProtocol */
}
