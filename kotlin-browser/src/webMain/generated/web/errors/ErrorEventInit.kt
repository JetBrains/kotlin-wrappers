// Automatically generated - do not modify!

package web.errors

import js.core.JsAny
import js.objects.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/ErrorEvent#options)
 */
@JsPlainObject
external interface ErrorEventInit :
    EventInit {
    var colno: Int?
    var error: JsAny?
    var filename: String?
    var lineno: Int?
    var message: String?
}
