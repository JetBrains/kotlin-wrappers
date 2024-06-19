// Automatically generated - do not modify!

package web.idb

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class IDBVersionChangeEventTypes {

    @JsValue("blocked")
    fun <C : EventTarget> blocked(): EventType<IDBVersionChangeEvent, C>

    @JsValue("upgradeneeded")
    fun <C : EventTarget> upgradeneeded(): EventType<IDBVersionChangeEvent, C>

    @JsValue("versionchange")
    fun <C : EventTarget> versionChange(): EventType<IDBVersionChangeEvent, C>
}
