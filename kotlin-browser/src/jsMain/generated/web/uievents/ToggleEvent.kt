// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface ToggleEventInit : EventInit {
    var newState: String?
    var oldState: String?
}

open external class ToggleEvent(
    override val type: EventType<ToggleEvent>,
    init: ToggleEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/newState) */
    val newState: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/oldState) */
    val oldState: String

    companion object
}
