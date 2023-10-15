// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.cssom

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface TransitionEventInit : EventInit {
    var elapsedTime: Double?
    var propertyName: String?
    var pseudoElement: String?
}

/**
 * Events providing information related to transitions.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent)
 */
open external class TransitionEvent(
    override val type: EventType<TransitionEvent>,
    init: TransitionEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/elapsedTime) */
    val elapsedTime: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/propertyName) */
    val propertyName: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/pseudoElement) */
    val pseudoElement: String

    companion object
}
