// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package dom.events

import web.events.Event
import web.events.EventInit

external interface TransitionEventInit : EventInit {
    var elapsedTime: Double?
    var propertyName: String?
    var pseudoElement: String?
}

open external class TransitionEvent(
    type: String,
    init: TransitionEventInit = definedExternally,
) : Event {
    val elapsedTime: Double
    val propertyName: String
    val pseudoElement: String

    companion object
}
