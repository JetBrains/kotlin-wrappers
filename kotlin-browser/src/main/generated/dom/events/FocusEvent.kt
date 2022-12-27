// Automatically generated - do not modify!

package dom.events

import web.events.EventTarget
import web.events.EventType

external interface FocusEventInit : UIEventInit {
    var relatedTarget: EventTarget?
}

open external class FocusEvent(
    type: EventType<FocusEvent>,
    init: FocusEventInit = definedExternally,
) : UIEvent {
    val relatedTarget: EventTarget?

    companion object
}
