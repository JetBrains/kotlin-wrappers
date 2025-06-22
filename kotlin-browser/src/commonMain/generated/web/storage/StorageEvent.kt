// Automatically generated - do not modify!

package web.storage

import js.reflect.unsafeCast
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`StorageEvent`** interface is implemented by the Window/storage_event event, which is sent to a window when a storage area the window has access to is changed within the context of another document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent)
 */
open external class StorageEvent(
    override val type: EventType<StorageEvent>,
    init: StorageEventInit = definedExternally,
) : Event {
    /**
     * The **`key`** property of the StorageEvent interface returns the key for the storage item that was changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/key)
     */
    val key: String?

    /**
     * The **`newValue`** property of the StorageEvent interface returns the new value of the storage item whose value was changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/newValue)
     */
    val newValue: String?

    /**
     * The **`oldValue`** property of the StorageEvent interface returns the original value of the storage item whose value changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/oldValue)
     */
    val oldValue: String?

    /**
     * The **`storageArea`** property of the StorageEvent interface returns the storage object that was affected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/storageArea)
     */
    val storageArea: Storage?

    /**
     * The **`url`** property of the StorageEvent interface returns the URL of the document whose storage changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/url)
     */
    val url: String

    companion object {
        @JsValue("storage")
        val STORAGE: EventType<StorageEvent>
    }
}

inline fun StorageEvent.asInit(): StorageEventInit =
    unsafeCast(this)
