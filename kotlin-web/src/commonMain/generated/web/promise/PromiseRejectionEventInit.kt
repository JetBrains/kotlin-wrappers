// Automatically generated - do not modify!

package web.promise

import js.errors.JsError
import js.objects.JsPlainObject
import js.promise.Promise
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/PromiseRejectionEvent/PromiseRejectionEvent#options)
 */
@JsPlainObject
external interface PromiseRejectionEventInit :
    EventInit {
    var promise: Promise<*>
    var reason: JsError?
}
