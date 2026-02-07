package js.temporal

import kotlinx.js.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface PlainDateISOFields {
    var isoYear: Int
    var isoMonth: Int
    var isoDay: Int
    var calendar: JsAny /* String | CalendarProtocol */
}
