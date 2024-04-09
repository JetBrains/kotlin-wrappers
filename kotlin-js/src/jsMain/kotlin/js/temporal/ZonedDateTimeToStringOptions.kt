package js.temporal

sealed external interface ZonedDateTimeToStringOptions :
    CalendarTypeToStringOptions {
    var timeZoneName: String? /* "auto" | "never" | "critical" */
    var offset: String? /* "auto" | "never" */
}
