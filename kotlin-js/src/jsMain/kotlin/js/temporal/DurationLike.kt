package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface DurationLike {
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
