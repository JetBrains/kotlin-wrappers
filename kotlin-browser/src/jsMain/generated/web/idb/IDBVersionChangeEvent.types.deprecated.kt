// Automatically generated - do not modify!

package web.idb

import seskar.js.JsValue
import web.events.EventType

sealed external class IDBVersionChangeEventTypes {

    @JsValue("blocked")
    fun blocked(): EventType<IDBVersionChangeEvent>

    @JsValue("success")
    fun success(): EventType<IDBVersionChangeEvent>

    @JsValue("upgradeneeded")
    fun upgradeneeded(): EventType<IDBVersionChangeEvent>

    @JsValue("versionchange")
    fun versionChange(): EventType<IDBVersionChangeEvent>
}
