// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface InputEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("InputEvent.beforeInput()"),
    )
    @JsValue("beforeinput")
    val BEFORE_INPUT: EventType<InputEvent<EventTarget>>
        get() = definedExternally
}