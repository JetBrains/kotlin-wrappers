// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external interface FocusEventTypes_deprecated {
    @JsValue("blur")
    val BLUR: EventType<FocusEvent<*>>
        get() = definedExternally

    @JsValue("focus")
    val FOCUS: EventType<FocusEvent<*>>
        get() = definedExternally

    @JsValue("focusin")
    val FOCUS_IN: EventType<FocusEvent<*>>
        get() = definedExternally

    @JsValue("focusout")
    val FOCUS_OUT: EventType<FocusEvent<*>>
        get() = definedExternally
}
