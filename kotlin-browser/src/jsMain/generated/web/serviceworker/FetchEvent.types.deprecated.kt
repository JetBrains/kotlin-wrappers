// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.serviceworker

import seskar.js.JsValue
import web.events.EventType

sealed external interface FetchEventTypes_deprecated {
    @JsValue("fetch")
    val FETCH: EventType<FetchEvent<*>>
        get() = definedExternally
}
