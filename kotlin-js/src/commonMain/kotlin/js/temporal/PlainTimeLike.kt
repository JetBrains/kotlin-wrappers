@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package js.temporal

import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface PlainTimeLike :
    JsAny {

    var hour: Int?
    var minute: Int?
    var second: Int?
    var millisecond: Int?
    var microsecond: Int?
    var nanosecond: Int?
}
