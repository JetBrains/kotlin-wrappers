package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface ShowCalendarOption {
    var calendarName: String? /* "auto" | "always" | "never" | "critical" */
}
