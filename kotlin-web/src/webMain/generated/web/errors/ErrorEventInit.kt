// Automatically generated - do not modify!

package web.errors

import kotlinx.js.JsPlainObject
import web.events.EventInit
import kotlin.js.JsAny

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
