// Automatically generated - do not modify!

package web.promise

import js.errors.JsError
import js.promise.Promise
import web.events.EventInit

external interface PromiseRejectionEventInit :
    EventInit {
    val promise: Promise<*>
    val reason: JsError?
}
