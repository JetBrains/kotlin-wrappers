// Automatically generated - do not modify!

package web.history

import js.core.JsAny
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * PopStateEvent is an event handler for the popstate event on the window.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent)
 */
open external class PopStateEvent(
    override val type: EventType<PopStateEvent>,
    init: PopStateEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent/hasUAVisualTransition)
     */
    val hasUAVisualTransition: Boolean

    /**
     * Returns a copy of the information that was provided to pushState() or replaceState().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent/state)
     */
    val state: JsAny?

    @JsAlias(THIS)
    override fun asInit(): PopStateEventInit

    companion object {
        @JsValue("popstate")
        val POP_STATE: EventType<PopStateEvent>
    }
}
