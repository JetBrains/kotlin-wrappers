// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.idb

import js.core.JsLong
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * This IndexedDB API interface indicates that the version of the database has changed, as the result of an IDBOpenDBRequest.onupgradeneeded event handler function.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent)
 */
open external class IDBVersionChangeEvent(
    override val type: EventType<IDBVersionChangeEvent, EventTarget>,
    init: IDBVersionChangeEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent/newVersion)
     */
    val newVersion: JsLong?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent/oldVersion)
     */
    val oldVersion: JsLong

    @JsAlias(THIS)
    override fun asInit(): IDBVersionChangeEventInit

    companion object : IDBVersionChangeEventTypes
}
