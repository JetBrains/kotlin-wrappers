// Automatically generated - do not modify!

package web.errors

import js.objects.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface ErrorEventInit :
    EventInit {
    val colno: UInt?
    val error: Any?
    val filename: String?
    val lineno: UInt?
    val message: String?
}
