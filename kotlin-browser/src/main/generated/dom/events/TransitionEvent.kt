// Automatically generated - do not modify!

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
