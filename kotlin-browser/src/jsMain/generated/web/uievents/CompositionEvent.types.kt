// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class CompositionEventTypes :
    CompositionEventTypes_deprecated {

    @JsValue("compositionend")
    val COMPOSITION_END: EventType<CompositionEvent>

    @JsValue("compositionstart")
    val COMPOSITION_START: EventType<CompositionEvent>

    @JsValue("compositionupdate")
    val COMPOSITION_UPDATE: EventType<CompositionEvent>
}
