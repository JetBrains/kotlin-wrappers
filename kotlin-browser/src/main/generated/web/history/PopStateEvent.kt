// Automatically generated - do not modify!

package web.history

import web.events.Event
import web.events.EventInit

external interface PopStateEventInit : EventInit {
    var state: Any?
}

open external class PopStateEvent(
    type: String,
    init: PopStateEventInit = definedExternally,
) : Event {
    /** Returns a copy of the information that was provided to pushState() or replaceState(). */
    val state: Any?

    companion object
}
