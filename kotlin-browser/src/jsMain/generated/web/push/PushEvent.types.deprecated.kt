// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.push

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface PushEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PushEvent.push()"),
    )
    @JsValue("push")
    val PUSH: EventType<PushEvent<EventTarget>>
        get() = definedExternally
}
