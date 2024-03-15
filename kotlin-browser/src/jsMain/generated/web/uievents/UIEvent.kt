// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import web.events.Event
import web.events.EventTarget
import web.events.EventType
import web.window.Window

/**
 * Simple user interface events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent)
 */
open external class UIEvent(
    override val type: EventType<UIEvent, EventTarget>,
    init: UIEventInit = definedExternally,
) : Event,
    UIEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/detail)
     */
    override val detail: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/view)
     */
    override val view: Window?

    companion object : UIEventTypes
}
