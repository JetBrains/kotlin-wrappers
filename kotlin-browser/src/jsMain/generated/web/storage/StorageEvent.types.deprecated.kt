// Automatically generated - do not modify!

package web.storage

import seskar.js.JsValue
import web.events.EventType

sealed external class StorageEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("StorageEvent.STORAGE"),
    )
    @JsValue("storage")
    fun storage(): EventType<StorageEvent>
}
