// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.storage

import seskar.js.JsValue
import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface StorageEventInit : EventInit {
    var key: String?
    var newValue: String?
    var oldValue: String?
    var storageArea: Storage?
    var url: String?
}

/**
 * A StorageEvent is sent to a window when a storage area it has access to is changed within the context of another document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent)
 */
open external class StorageEvent(
    override val type: EventType<StorageEvent>,
    init: StorageEventInit = definedExternally,
) : Event {
    /**
     * Returns the key of the storage item being changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/key)
     */
    val key: String?

    /**
     * Returns the new value of the key of the storage item whose value is being changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/newValue)
     */
    val newValue: String?

    /**
     * Returns the old value of the key of the storage item whose value is being changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/oldValue)
     */
    val oldValue: String?

    /**
     * Returns the Storage object that was affected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/storageArea)
     */
    val storageArea: Storage?

    /**
     * Returns the URL of the document whose storage item changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/url)
     */
    val url: String

    companion object {
        @JsValue("storage")
        val STORAGE: EventType<StorageEvent>
    }
}
