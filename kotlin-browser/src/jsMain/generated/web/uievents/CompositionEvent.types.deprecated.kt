// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface CompositionEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("CompositionEvent.compositionEnd()"),
    )
    @JsValue("compositionend")
    val COMPOSITION_END: EventType<CompositionEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("CompositionEvent.compositionStart()"),
    )
    @JsValue("compositionstart")
    val COMPOSITION_START: EventType<CompositionEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("CompositionEvent.compositionUpdate()"),
    )
    @JsValue("compositionupdate")
    val COMPOSITION_UPDATE: EventType<CompositionEvent<EventTarget>>
        get() = definedExternally
}
