// Automatically generated - do not modify!

package web.popover

import js.reflect.unsafeCast
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`ToggleEvent`** interface represents an event notifying the user an Element's state has changed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent)
 */
open external class ToggleEvent(
    override val type: EventType<ToggleEvent>,
    init: ToggleEventInit = definedExternally,
) : Event {
    /**
     * The **`newState`** read-only property of the ToggleEvent interface is a string representing the state the element is transitioning to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/newState)
     */
    val newState: ToggleState

    /**
     * The **`oldState`** read-only property of the ToggleEvent interface is a string representing the state the element is transitioning from.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/oldState)
     */
    val oldState: ToggleState

    companion object {
        @JsValue("beforetoggle")
        val BEFORE_TOGGLE: EventType<ToggleEvent>

        @JsValue("toggle")
        val TOGGLE: EventType<ToggleEvent>
    }
}

inline fun ToggleEvent.asInit(): ToggleEventInit =
    unsafeCast(this)
