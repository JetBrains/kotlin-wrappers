// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.history

import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * PopStateEvent is an event handler for the popstate event on the window.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent)
 */
open external class PopStateEvent<out C : EventTarget?>(
    override val type: EventType<PopStateEvent<EventTarget>>,
    init: PopStateEventInit = definedExternally,
) : Event<C>,
    PopStateEventInit {
    /**
     * Returns a copy of the information that was provided to pushState() or replaceState().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent/state)
     */
    override val state: Any?

    companion object : PopStateEventTypes
}
