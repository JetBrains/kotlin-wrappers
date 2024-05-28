package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface CalendarTypeToStringOptions :
    ToStringPrecisionOptions,
    ShowCalendarOption
