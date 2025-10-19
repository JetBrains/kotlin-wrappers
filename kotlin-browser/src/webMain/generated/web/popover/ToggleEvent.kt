// Automatically generated - do not modify!

package web.popover

import js.reflect.unsafeCast
import web.dom.Element
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

    /**
     * The **`source`** read-only property of the ToggleEvent interface is an Element object instance representing the HTML popover control element that initiated the toggle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/source)
     */
    val source: Element?

    companion object
}

inline fun ToggleEvent.asInit(): ToggleEventInit =
    unsafeCast(this)

inline val ToggleEvent.Companion.BEFORE_TOGGLE: EventType<ToggleEvent>
    get() = EventType("beforetoggle")

inline val ToggleEvent.Companion.TOGGLE: EventType<ToggleEvent>
    get() = EventType("toggle")
