package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface ZonedDateTimeToStringOptions :
    CalendarTypeToStringOptions {
    var timeZoneName: String? /* "auto" | "never" | "critical" */
    var offset: String? /* "auto" | "never" */
}
