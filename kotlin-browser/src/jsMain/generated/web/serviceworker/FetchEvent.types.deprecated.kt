// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.serviceworker

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface FetchEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("FetchEvent.fetch()"),
    )
    @JsValue("fetch")
    val FETCH: EventType<FetchEvent<EventTarget>>
        get() = definedExternally
}
