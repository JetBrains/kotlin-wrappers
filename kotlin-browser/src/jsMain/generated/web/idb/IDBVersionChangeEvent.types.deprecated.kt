// Automatically generated - do not modify!

package web.idb

import seskar.js.JsValue
import web.events.EventType

sealed external class IDBVersionChangeEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("IDBVersionChangeEvent.BLOCKED"),
    )
    @JsValue("blocked")
    fun blocked(): EventType<IDBVersionChangeEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("IDBVersionChangeEvent.SUCCESS"),
    )
    @JsValue("success")
    fun success(): EventType<IDBVersionChangeEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("IDBVersionChangeEvent.UPGRADENEEDED"),
    )
    @JsValue("upgradeneeded")
    fun upgradeneeded(): EventType<IDBVersionChangeEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("IDBVersionChangeEvent.VERSION_CHANGE"),
    )
    @JsValue("versionchange")
    fun versionChange(): EventType<IDBVersionChangeEvent>
}
