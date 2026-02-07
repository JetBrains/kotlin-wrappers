package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ZonedDateTimeToStringOptions :
    CalendarTypeToStringOptions {
    var timeZoneName: String? /* "auto" | "never" | "critical" */
    var offset: String? /* "auto" | "never" */
}
