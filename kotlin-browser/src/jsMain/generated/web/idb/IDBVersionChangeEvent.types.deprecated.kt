// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.idb

import seskar.js.JsValue
import web.events.EventType

sealed external interface IDBVersionChangeEventTypes_deprecated {
    @JsValue("blocked")
    val BLOCKED: EventType<IDBVersionChangeEvent<*>>
        get() = definedExternally

    @JsValue("upgradeneeded")
    val UPGRADENEEDED: EventType<IDBVersionChangeEvent<*>>
        get() = definedExternally

    @JsValue("versionchange")
    val VERSION_CHANGE: EventType<IDBVersionChangeEvent<*>>
        get() = definedExternally
}
