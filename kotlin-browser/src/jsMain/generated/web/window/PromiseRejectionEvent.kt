// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.window

import js.promise.Promise
import seskar.js.JsValue
import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface PromiseRejectionEventInit : EventInit {
    var promise: Promise<*>
    var reason: Any?
}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent) */
open external class PromiseRejectionEvent(
    override val type: EventType<PromiseRejectionEvent>,
    init: PromiseRejectionEventInit,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/promise) */
    val promise: Promise<*>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/reason) */
    val reason: Any?

    companion object {
        @JsValue("rejectionhandled")
        val REJECTION_HANDLED: EventType<PromiseRejectionEvent>

        @JsValue("unhandledrejection")
        val UNHANDLED_REJECTION: EventType<PromiseRejectionEvent>
    }
}
