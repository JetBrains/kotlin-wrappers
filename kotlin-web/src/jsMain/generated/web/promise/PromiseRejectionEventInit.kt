// Automatically generated - do not modify!

package web.promise

import js.errors.JsError
import js.promise.Promise
import kotlinx.js.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface PromiseRejectionEventInit :
    EventInit {
    val promise: Promise<*>
    val reason: JsError?
}
