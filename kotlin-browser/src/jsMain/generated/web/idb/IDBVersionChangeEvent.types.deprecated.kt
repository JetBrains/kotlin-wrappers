// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.idb

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface IDBVersionChangeEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("IDBVersionChangeEvent.blocked()"),
    )
    @JsValue("blocked")
    val BLOCKED: EventType<IDBVersionChangeEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("IDBVersionChangeEvent.upgradeneeded()"),
    )
    @JsValue("upgradeneeded")
    val UPGRADENEEDED: EventType<IDBVersionChangeEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("IDBVersionChangeEvent.versionChange()"),
    )
    @JsValue("versionchange")
    val VERSION_CHANGE: EventType<IDBVersionChangeEvent<EventTarget>>
        get() = definedExternally
}
