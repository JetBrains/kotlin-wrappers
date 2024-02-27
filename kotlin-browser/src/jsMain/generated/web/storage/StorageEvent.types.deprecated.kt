// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.storage

import seskar.js.JsValue
import web.events.EventType

sealed external interface StorageEventTypes_deprecated {
    @JsValue("storage")
    val STORAGE: EventType<StorageEvent<*>>
        get() = definedExternally
}
