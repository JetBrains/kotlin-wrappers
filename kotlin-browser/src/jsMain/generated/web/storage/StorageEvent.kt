// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.storage

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * A StorageEvent is sent to a window when a storage area it has access to is changed within the context of another document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent)
 */
open external class StorageEvent(
    override val type: EventType<StorageEvent, EventTarget>,
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

    @JsAlias(THIS)
    override fun asInit(): StorageEventInit

    companion object : StorageEventTypes
}
