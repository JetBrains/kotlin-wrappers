// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.history

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface PopStateEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PopStateEvent.popState()"),
    )
    @JsValue("popstate")
    val POP_STATE: EventType<PopStateEvent<EventTarget>>
        get() = definedExternally
}
