// Automatically generated - do not modify!

package dom.events

import web.events.EventTarget

external interface FocusEventInit : UIEventInit {
    var relatedTarget: EventTarget?
}

open external class FocusEvent(
    type: String,
    init: FocusEventInit = definedExternally,
) : UIEvent {
    val relatedTarget: EventTarget?

    companion object
}
