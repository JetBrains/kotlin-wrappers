package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface ZonedDateTimeToStringOptions :
    CalendarTypeToStringOptions {
    var timeZoneName: String? /* "auto" | "never" | "critical" */
    var offset: String? /* "auto" | "never" */
}
