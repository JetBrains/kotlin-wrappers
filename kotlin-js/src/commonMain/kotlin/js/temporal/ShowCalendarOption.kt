package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface ShowCalendarOption {
    var calendarName: String? /* "auto" | "always" | "never" | "critical" */
}
