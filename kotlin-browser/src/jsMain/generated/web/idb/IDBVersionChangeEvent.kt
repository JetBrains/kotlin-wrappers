// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.idb

import js.core.JsLong
import web.events.Event
import web.events.EventInit
import web.events.EventType

/**
 * This IndexedDB API interface indicates that the version of the database has changed, as the result of an IDBOpenDBRequest.onupgradeneeded event handler function.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent)
 */
external interface IDBVersionChangeEventInit : EventInit {
    var newVersion: JsLong?
    var oldVersion: JsLong?
}

open external class IDBVersionChangeEvent(
    override val type: EventType<IDBVersionChangeEvent>,
    init: IDBVersionChangeEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent/newVersion) */
    val newVersion: JsLong?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent/oldVersion) */
    val oldVersion: JsLong

    companion object
}
