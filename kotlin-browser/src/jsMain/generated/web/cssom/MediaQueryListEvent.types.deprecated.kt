// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import web.events.EventType

sealed external interface MediaQueryListEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MediaQueryListEvent.change()"),
    )
    @JsValue("change")
    val CHANGE: EventType<MediaQueryListEvent<*>>
        get() = definedExternally
}
