// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import web.window.Window
import kotlin.js.definedExternally

/**
 * The **`UIEvent`** interface represents simple user interface events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent)
 */
open external class UIEvent(
    override val type: EventType<UIEvent>,
    init: UIEventInit = definedExternally,
) : Event {
    /**
     * The **`UIEvent.detail`** read-only property, when non-zero, provides the current (or next, depending on the event) click count.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/detail)
     */
    val detail: Int

    /**
     * The **`UIEvent.view`** read-only property returns the is the Window object the event happened in.
     *
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
