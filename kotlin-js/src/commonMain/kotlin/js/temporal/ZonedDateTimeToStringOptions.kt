package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface ZonedDateTimeToStringOptions :
    CalendarTypeToStringOptions {
    var timeZoneName: String? /* "auto" | "never" | "critical" */
    var offset: String? /* "auto" | "never" */
}
