// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class CompositionEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("CompositionEvent.COMPOSITION_END"),
    )
    @JsValue("compositionend")
    fun compositionEnd(): EventType<CompositionEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("CompositionEvent.COMPOSITION_START"),
    )
    @JsValue("compositionstart")
    fun compositionStart(): EventType<CompositionEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("CompositionEvent.COMPOSITION_UPDATE"),
    )
    @JsValue("compositionupdate")
    fun compositionUpdate(): EventType<CompositionEvent>
}
