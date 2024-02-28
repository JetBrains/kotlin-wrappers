// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.sockets

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface CloseEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("CloseEvent.close()"),
    )
    @JsValue("close")
    val CLOSE: EventType<CloseEvent<EventTarget>>
        get() = definedExternally
}
