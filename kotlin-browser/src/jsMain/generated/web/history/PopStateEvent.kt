// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.history

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.Event
import web.events.EventType

/**
 * PopStateEvent is an event handler for the popstate event on the window.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent)
 */
open external class PopStateEvent(
    override val type: EventType<PopStateEvent>,
    init: PopStateEventInit = definedExternally,
) : Event {
    val hasUAVisualTransition: Boolean

    /**
     * Returns a copy of the information that was provided to pushState() or replaceState().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent/state)
     */
    val state: Any?

    @JsAlias(THIS)
    override fun asInit(): PopStateEventInit

    companion object : PopStateEventTypes
}
