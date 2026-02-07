package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ShowCalendarOption {
    var calendarName: String? /* "auto" | "always" | "never" | "critical" */
}
