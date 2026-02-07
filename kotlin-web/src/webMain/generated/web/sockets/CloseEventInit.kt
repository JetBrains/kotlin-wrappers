// Automatically generated - do not modify!

package web.sockets

import kotlinx.js.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/CloseEvent#options)
 */
@JsPlainObject
external interface CloseEventInit :
    EventInit {
    var code: Short?
    var reason: String?
    var wasClean: Boolean?
}
