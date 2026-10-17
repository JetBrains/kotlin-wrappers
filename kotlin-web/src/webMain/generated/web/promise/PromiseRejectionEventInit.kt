// Automatically generated - do not modify!

package web.promise

import js.errors.JsError
import js.promise.Promise
import kotlinx.js.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/PromiseRejectionEvent#options)
 */
@JsPlainObject
external interface PromiseRejectionEventInit :
    EventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/PromiseRejectionEvent#promise)
     */
    var promise: Promise<*>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/PromiseRejectionEvent#reason)
     */
    var reason: JsError?
}
