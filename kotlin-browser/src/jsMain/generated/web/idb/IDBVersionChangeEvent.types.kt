// Automatically generated - do not modify!

package web.idb

import seskar.js.JsValue
import web.events.EventType

sealed external class IDBVersionChangeEventTypes {

    @JsValue("blocked")
    val BLOCKED: EventType<IDBVersionChangeEvent>

    @JsValue("success")
    val SUCCESS: EventType<IDBVersionChangeEvent>

    @JsValue("upgradeneeded")
    val UPGRADENEEDED: EventType<IDBVersionChangeEvent>

    @JsValue("versionchange")
    val VERSION_CHANGE: EventType<IDBVersionChangeEvent>
}
