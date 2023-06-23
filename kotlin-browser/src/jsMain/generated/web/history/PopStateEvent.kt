// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.history

import web.events.Event
import web.events.EventInit
import web.events.EventType

/**
 * PopStateEvent is an event handler for the popstate event on the window.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent)
 */
external interface PopStateEventInit : EventInit {
    var state: Any?
}

open external class PopStateEvent(
    override val type: EventType<PopStateEvent>,
    init: PopStateEventInit = definedExternally,
) : Event {
    /**
     * Returns a copy of the information that was provided to pushState() or replaceState().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent/state)
     */
    val state: Any?

    companion object
}
