// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventType

external interface CompositionEventInit : UIEventInit {
    var data: String?
}

/**
 * The DOM CompositionEvent represents events that occur due to the user indirectly entering text.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent)
 */
open external class CompositionEvent(
    override val type: EventType<CompositionEvent>,
    init: CompositionEventInit = definedExternally,
) : UIEvent {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent/data) */
    val data: String

    companion object {
        @JsValue("compositionend")
        val COMPOSITION_END: EventType<CompositionEvent>

        @JsValue("compositionstart")
        val COMPOSITION_START: EventType<CompositionEvent>

        @JsValue("compositionupdate")
        val COMPOSITION_UPDATE: EventType<CompositionEvent>
    }
}
