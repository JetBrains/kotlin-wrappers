package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface ShowCalendarOption {
    val calendarName: String? /* "auto" | "always" | "never" | "critical" */
}
