// Automatically generated - do not modify!

package web.errors

import js.core.JsAny
import js.objects.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface ErrorEventInit :
    EventInit {
    var colno: Int?
    var error: JsAny?
    var filename: String?
    var lineno: Int?
    var message: String?
}
