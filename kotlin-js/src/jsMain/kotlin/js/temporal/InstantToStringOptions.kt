package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface InstantToStringOptions :
    ToStringPrecisionOptions {
    val timeZone: TimeZoneLike
}
