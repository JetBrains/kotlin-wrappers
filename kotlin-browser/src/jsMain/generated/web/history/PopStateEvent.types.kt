// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.history

import seskar.js.JsValue
import web.events.EventType

sealed external interface PopStateEventTypes {
    @JsValue("popstate")
    val POP_STATE: EventType<PopStateEvent>
        get() = definedExternally
}
