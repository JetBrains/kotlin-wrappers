package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ZonedDateTimeToStringOptions :
    CalendarTypeToStringOptions {
    val timeZoneName: String? /* "auto" | "never" | "critical" */
    val offset: String? /* "auto" | "never" */
}
