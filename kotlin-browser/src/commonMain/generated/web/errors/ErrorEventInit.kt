// Automatically generated - do not modify!

package web.errors

import js.core.JsAny
import js.objects.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface ErrorEventInit :
    EventInit {
    val colno: Int?
    val error: JsAny?
    val filename: String?
    val lineno: Int?
    val message: String?
}
