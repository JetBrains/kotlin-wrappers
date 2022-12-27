// Automatically generated - do not modify!

package dom.events

import web.events.EventType

external interface CompositionEventInit : UIEventInit {
    var data: String?
}

open external class CompositionEvent(
    type: EventType<CompositionEvent>,
    init: CompositionEventInit = definedExternally,
) : UIEvent {
    val data: String

    companion object
}
