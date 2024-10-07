package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface CalendarTypeToStringOptions :
    ToStringPrecisionOptions,
    ShowCalendarOption
