// Automatically generated - do not modify!

package dom.events

import web.events.Event
import web.events.EventInit
import kotlin.js.Promise

external interface PromiseRejectionEventInit : EventInit {
    var promise: Promise<*>
    var reason: Any?
}

open external class PromiseRejectionEvent(
    type: String,
    init: PromiseRejectionEventInit,
) : Event {
    val promise: Promise<*>
    val reason: Any?

    companion object
}
