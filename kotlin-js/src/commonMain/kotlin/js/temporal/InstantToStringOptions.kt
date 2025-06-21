package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface InstantToStringOptions :
    ToStringPrecisionOptions {
    var timeZone: TimeZone
}
