// Automatically generated - do not modify!

package web.errors

import kotlinx.js.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/ErrorEvent#options)
 */
@JsPlainObject
external interface ErrorEventInit :
    EventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/ErrorEvent#colno)
     */
    var colno: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/ErrorEvent#error)
     */
    var error: JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/ErrorEvent#filename)
     */
    var filename: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/ErrorEvent#lineno)
     */
    var lineno: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/ErrorEvent#message)
     */
    var message: String?
}
