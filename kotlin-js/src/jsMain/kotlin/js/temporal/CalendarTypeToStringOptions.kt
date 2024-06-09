package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface CalendarTypeToStringOptions :
    ToStringPrecisionOptions,
    ShowCalendarOption
