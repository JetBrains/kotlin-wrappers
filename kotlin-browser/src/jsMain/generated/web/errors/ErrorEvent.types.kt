// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.errors

import seskar.js.JsValue
import web.events.EventType

sealed external interface ErrorEventTypes {
    @JsValue("error")
    val ERROR: EventType<ErrorEvent>
        get() = definedExternally
}
