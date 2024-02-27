// Automatically generated - do not modify!

package web.idb

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class IDBVersionChangeEventTypes :
    IDBVersionChangeEventTypes_deprecated {

    @JsValue("blocked")
    fun <C : EventTarget> blocked(): EventType<IDBVersionChangeEvent<C>>

    @JsValue("upgradeneeded")
    fun <C : EventTarget> upgradeneeded(): EventType<IDBVersionChangeEvent<C>>

    @JsValue("versionchange")
    fun <C : EventTarget> versionChange(): EventType<IDBVersionChangeEvent<C>>
}
