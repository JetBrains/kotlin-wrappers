package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface InstantToStringOptions :
    ToStringPrecisionOptions {
    var timeZone: TimeZoneLike
}
