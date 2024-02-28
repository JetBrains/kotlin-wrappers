// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface KeyboardEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("KeyboardEvent.keyDown()"),
    )
    @JsValue("keydown")
    val KEY_DOWN: EventType<KeyboardEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("KeyboardEvent.keyPress()"),
    )
    @JsValue("keypress")
    val KEY_PRESS: EventType<KeyboardEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("KeyboardEvent.keyUp()"),
    )
    @JsValue("keyup")
    val KEY_UP: EventType<KeyboardEvent<EventTarget>>
        get() = definedExternally
}
