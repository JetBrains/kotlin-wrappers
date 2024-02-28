// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent)
 */
open external class ToggleEvent<out C : EventTarget?>(
    override val type: EventType<ToggleEvent<EventTarget>>,
    init: ToggleEventInit = definedExternally,
) : Event<C>,
    ToggleEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/newState)
     */
    override val newState: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/oldState)
     */
    override val oldState: String

    companion object
}
