// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import web.events.EventTarget
import web.events.EventType

external interface FocusEventInit : UIEventInit {
    var relatedTarget: EventTarget?
}

open external class FocusEvent(
    override val type: EventType<FocusEvent>,
    init: FocusEventInit = definedExternally,
) : UIEvent {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent/relatedTarget) */
    val relatedTarget: EventTarget?

    companion object
}
