// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import web.events.Event
import web.events.EventInit
import web.events.EventType
import web.window.Window

external interface UIEventInit : EventInit {
    var detail: Int?
    var view: Window?
}

open external class UIEvent(
    override val type: EventType<UIEvent>,
    init: UIEventInit = definedExternally,
) : Event {
    val detail: Int
    val view: Window?

    companion object
}
