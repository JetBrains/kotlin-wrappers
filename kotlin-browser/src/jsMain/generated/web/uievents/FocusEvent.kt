// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

external interface FocusEventInit : UIEventInit {
    var relatedTarget: EventTarget?
}

/**
 * Focus-related events like focus, blur, focusin, or focusout.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent)
 */
open external class FocusEvent(
    override val type: EventType<FocusEvent>,
    init: FocusEventInit = definedExternally,
) : UIEvent {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent/relatedTarget) */
    val relatedTarget: EventTarget?

    companion object {
        @JsValue("blur")
        val BLUR: EventType<FocusEvent>

        @JsValue("focus")
        val FOCUS: EventType<FocusEvent>

        @JsValue("focusin")
        val FOCUS_IN: EventType<FocusEvent>

        @JsValue("focusout")
        val FOCUS_OUT: EventType<FocusEvent>
    }
}
