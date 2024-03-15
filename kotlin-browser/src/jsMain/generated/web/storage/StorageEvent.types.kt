// Automatically generated - do not modify!

package web.storage

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class StorageEventTypes {

    @JsValue("storage")
    fun <C : EventTarget> storage(): EventType<StorageEvent, C>
}
