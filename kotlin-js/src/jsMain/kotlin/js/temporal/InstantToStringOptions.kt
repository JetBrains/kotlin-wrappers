package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface InstantToStringOptions :
    ToStringPrecisionOptions {
    val timeZone: TimeZoneLike
}
