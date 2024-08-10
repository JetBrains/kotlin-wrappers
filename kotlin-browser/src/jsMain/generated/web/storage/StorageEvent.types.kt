// Automatically generated - do not modify!

package web.storage

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class StorageEventTypes {

    @JsValue("storage")
    fun <C : EventTarget> storage(): EventType<StorageEvent, C>
}
