// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package websockets

import seskar.js.JsValue
import web.events.EventType

sealed external interface CloseEventTypes {
    @JsValue("close")
    val CLOSE: EventType<CloseEvent>
        get() = definedExternally
}
