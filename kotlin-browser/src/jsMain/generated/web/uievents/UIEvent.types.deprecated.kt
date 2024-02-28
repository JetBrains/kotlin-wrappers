// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external interface UIEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("UIEvent.abort()"),
    )
    @JsValue("abort")
    val ABORT: EventType<UIEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("UIEvent.resize()"),
    )
    @JsValue("resize")
    val RESIZE: EventType<UIEvent<*>>
        get() = definedExternally
}
