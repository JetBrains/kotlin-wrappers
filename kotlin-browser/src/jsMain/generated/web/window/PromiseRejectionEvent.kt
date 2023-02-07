// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.window

import web.events.Event
import web.events.EventInit
import web.events.EventType
import kotlin.js.Promise

external interface PromiseRejectionEventInit : EventInit {
    var promise: Promise<*>
    var reason: Any?
}

open external class PromiseRejectionEvent(
    override val type: EventType<PromiseRejectionEvent>,
    init: PromiseRejectionEventInit,
) : Event {
    val promise: Promise<*>
    val reason: Any?

    companion object
}
