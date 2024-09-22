// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import web.window.Window

/**
 * Simple user interface events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent)
 */
open external class UIEvent(
    override val type: EventType<UIEvent>,
    init: UIEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/detail)
     */
    val detail: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/view)
     */
    val view: Window?

    @JsAlias(THIS)
    override fun asInit(): UIEventInit

    companion object {
        @JsValue("abort")
        val ABORT: EventType<UIEvent>

        @JsValue("resize")
        val RESIZE: EventType<UIEvent>
    }
}
