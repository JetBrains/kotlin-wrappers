// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external interface KeyboardEventTypes_deprecated {
    @JsValue("keydown")
    val KEY_DOWN: EventType<KeyboardEvent<*>>
        get() = definedExternally

    @JsValue("keypress")
    val KEY_PRESS: EventType<KeyboardEvent<*>>
        get() = definedExternally

    @JsValue("keyup")
    val KEY_UP: EventType<KeyboardEvent<*>>
        get() = definedExternally
}
