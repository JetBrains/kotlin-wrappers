// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.history

import seskar.js.JsValue
import web.events.EventType

sealed external interface HashChangeEventTypes {
    @JsValue("hashchange")
    val HASH_CHANGE: EventType<HashChangeEvent<*>>
        get() = definedExternally
}
