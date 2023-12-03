// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.window

import seskar.js.JsValue
import web.events.EventType

sealed external interface BeforeUnloadEventTypes {
    @JsValue("beforeunload")
    val BEFORE_UNLOAD: EventType<BeforeUnloadEvent>
        get() = definedExternally
}
