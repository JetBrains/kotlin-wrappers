// Automatically generated - do not modify!

package web.idb

import js.core.UInt53
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`IDBVersionChangeEvent`** interface of the IndexedDB API indicates that the version of the database has changed, as the result of an IDBOpenDBRequest.upgradeneeded_event event handler function.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent)
 */
open external class IDBVersionChangeEvent(
    override val type: EventType<IDBVersionChangeEvent>,
    init: IDBVersionChangeEventInit = definedExternally,
) : Event {
    /**
     * The **`newVersion`** read-only property of the database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent/newVersion)
     */
    val newVersion: UInt53?

    /**
     * The **`oldVersion`** read-only property of the database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent/oldVersion)
     */
    val oldVersion: UInt53

    @JsAlias(THIS)
    override fun asInit(): IDBVersionChangeEventInit

    companion object {
        @JsValue("blocked")
        val BLOCKED: EventType<IDBVersionChangeEvent>

        @JsValue("success")
        val SUCCESS: EventType<IDBVersionChangeEvent>

        @JsValue("upgradeneeded")
        val UPGRADENEEDED: EventType<IDBVersionChangeEvent>

        @JsValue("versionchange")
        val VERSION_CHANGE: EventType<IDBVersionChangeEvent>
    }
}
