// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.window

import js.promise.Promise
import web.events.Event
import web.events.EventInit
import web.events.EventType

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent) */
external interface PromiseRejectionEventInit : EventInit {
    var promise: Promise<*>
    var reason: Any?
}

open external class PromiseRejectionEvent(
    override val type: EventType<PromiseRejectionEvent>,
    init: PromiseRejectionEventInit,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/promise) */
    val promise: Promise<*>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/reason) */
    val reason: Any?

    companion object
}
