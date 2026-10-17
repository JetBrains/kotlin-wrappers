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
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/CloseEvent#code)
     */
    var code: Short?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/CloseEvent#reason)
     */
    var reason: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/CloseEvent#wasClean)
     */
    var wasClean: Boolean?
}
