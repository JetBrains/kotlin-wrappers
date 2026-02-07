package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface InstantToStringOptions :
    ToStringPrecisionOptions {
    var timeZone: TimeZone
}
