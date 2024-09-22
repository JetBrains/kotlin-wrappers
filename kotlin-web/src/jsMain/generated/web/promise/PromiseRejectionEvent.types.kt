// Automatically generated - do not modify!

package web.promise

import seskar.js.JsValue
import web.events.EventType

sealed external class PromiseRejectionEventTypes {

    @JsValue("rejectionhandled")
    val REJECTION_HANDLED: EventType<PromiseRejectionEvent>

    @JsValue("unhandledrejection")
    val UNHANDLED_REJECTION: EventType<PromiseRejectionEvent>
}
