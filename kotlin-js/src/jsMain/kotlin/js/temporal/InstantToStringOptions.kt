package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface InstantToStringOptions :
    ToStringPrecisionOptions {
    var timeZone: TimeZoneLike
}
