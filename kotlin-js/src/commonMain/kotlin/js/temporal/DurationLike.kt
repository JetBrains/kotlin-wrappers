package js.temporal

import js.core.JsAnyMarker
import js.objects.JsPlainObject

@JsPlainObject
external interface DurationLike :
    JsAnyMarker {

    val years: Int?
    val months: Int?
    val weeks: Int?
    val days: Int?
    val hours: Int?
    val minutes: Int?
    val seconds: Int?
    val milliseconds: Int?
    val microseconds: Int?
    val nanoseconds: Int?
}
