package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface ShowCalendarOption {
    var calendarName: String? /* "auto" | "always" | "never" | "critical" */
}
