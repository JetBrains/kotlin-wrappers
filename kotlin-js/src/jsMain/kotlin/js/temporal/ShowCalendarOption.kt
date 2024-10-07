package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ShowCalendarOption {
    val calendarName: String? /* "auto" | "always" | "never" | "critical" */
}
