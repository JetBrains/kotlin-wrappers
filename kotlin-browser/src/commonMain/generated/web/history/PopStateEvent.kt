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
 * **`PopStateEvent`** is an interface for the Window/popstate_event event.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent)
 */
open external class PopStateEvent(
    override val type: EventType<PopStateEvent>,
    init: PopStateEventInit = definedExternally,
) : Event {
    /**
     * The **`hasUAVisualTransition`** read-only property of the PopStateEvent interface returns `true` if the user agent performed a visual transition for this navigation before dispatching this event, or `false` otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent/hasUAVisualTransition)
     */
    val hasUAVisualTransition: Boolean

    /**
     * The **`state`** read-only property of the PopStateEvent interface represents the state stored when the event was created.
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
