// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package dom.events

import kotlinx.js.HighResTimeStamp
import web.events.Event
import web.events.EventInit

external interface TransitionEventInit : EventInit {
    var elapsedTime: HighResTimeStamp?
    var propertyName: String?
    var pseudoElement: String?
}

external class TransitionEvent(
    type: String,
    init: TransitionEventInit = definedExternally,
) : Event {
    val elapsedTime: HighResTimeStamp
    val propertyName: String
    val pseudoElement: String

    companion object
}
