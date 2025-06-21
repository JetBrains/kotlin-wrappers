// Automatically generated - do not modify!

package web.promise

import js.errors.JsError
import js.objects.JsPlainObject
import js.promise.Promise
import web.events.EventInit

@JsPlainObject
external interface PromiseRejectionEventInit :
    EventInit {
    var promise: Promise<*>
    var reason: JsError?
}
