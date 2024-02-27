// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.push

import seskar.js.JsValue
import web.events.EventType

sealed external interface PushEventTypes_deprecated {
    @JsValue("push")
    val PUSH: EventType<PushEvent<*>>
        get() = definedExternally
}
