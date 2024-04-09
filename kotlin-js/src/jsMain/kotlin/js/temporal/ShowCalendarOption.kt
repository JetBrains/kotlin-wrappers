package js.temporal

sealed external interface ShowCalendarOption {
    var calendarName: String? /* "auto" | "always" | "never" | "critical" */
}
