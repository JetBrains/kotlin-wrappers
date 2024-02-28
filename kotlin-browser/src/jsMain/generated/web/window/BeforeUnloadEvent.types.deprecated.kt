// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.window

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface BeforeUnloadEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("BeforeUnloadEvent.beforeUnload()"),
    )
    @JsValue("beforeunload")
    val BEFORE_UNLOAD: EventType<BeforeUnloadEvent<EventTarget>>
        get() = definedExternally
}
