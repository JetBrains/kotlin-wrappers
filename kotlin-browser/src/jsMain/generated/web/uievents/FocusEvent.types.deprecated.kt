// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface FocusEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("FocusEvent.blur()"),
    )
    @JsValue("blur")
    val BLUR: EventType<FocusEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("FocusEvent.focus()"),
    )
    @JsValue("focus")
    val FOCUS: EventType<FocusEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("FocusEvent.focusIn()"),
    )
    @JsValue("focusin")
    val FOCUS_IN: EventType<FocusEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("FocusEvent.focusOut()"),
    )
    @JsValue("focusout")
    val FOCUS_OUT: EventType<FocusEvent<EventTarget>>
        get() = definedExternally
}
