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

/**
 * Simple user interface events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent)
 */
open external class UIEvent(
    override val type: EventType<UIEvent>,
    init: UIEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/detail) */
    val detail: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/view) */
    val view: Window?

    companion object
}
