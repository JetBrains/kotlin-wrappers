// Automatically generated - do not modify!

package web.idb

import js.core.UInt53
import js.reflect.unsafeCast
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

    companion object
}

inline fun IDBVersionChangeEvent.asInit(): IDBVersionChangeEventInit =
    unsafeCast(this)

inline val IDBVersionChangeEvent.Companion.BLOCKED: EventType<IDBVersionChangeEvent>
    get() = EventType("blocked")

inline val IDBVersionChangeEvent.Companion.SUCCESS: EventType<IDBVersionChangeEvent>
    get() = EventType("success")

inline val IDBVersionChangeEvent.Companion.UPGRADENEEDED: EventType<IDBVersionChangeEvent>
    get() = EventType("upgradeneeded")

inline val IDBVersionChangeEvent.Companion.VERSION_CHANGE: EventType<IDBVersionChangeEvent>
    get() = EventType("versionchange")
