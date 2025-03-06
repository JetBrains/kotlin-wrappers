package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface ZonedDateTimeToStringOptions :
    CalendarTypeToStringOptions {
    val timeZoneName: String? /* "auto" | "never" | "critical" */
    val offset: String? /* "auto" | "never" */
}
