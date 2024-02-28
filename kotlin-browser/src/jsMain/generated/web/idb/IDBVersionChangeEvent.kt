// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.idb

import js.core.JsLong
import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * This IndexedDB API interface indicates that the version of the database has changed, as the result of an IDBOpenDBRequest.onupgradeneeded event handler function.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent)
 */
open external class IDBVersionChangeEvent<out C : EventTarget?>(
    override val type: EventType<IDBVersionChangeEvent<EventTarget>>,
    init: IDBVersionChangeEventInit = definedExternally,
) : Event<C>,
    IDBVersionChangeEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent/newVersion)
     */
    override val newVersion: JsLong?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent/oldVersion)
     */
    override val oldVersion: JsLong

    companion object : IDBVersionChangeEventTypes
}
