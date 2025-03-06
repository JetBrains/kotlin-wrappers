@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package js.temporal

import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface DurationLike :
    JsAny {

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
