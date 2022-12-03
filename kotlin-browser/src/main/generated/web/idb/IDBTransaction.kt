// Automatically generated - do not modify!

package web.idb

import dom.DOMStringList
import web.errors.DOMException
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class IDBTransaction :
    EventTarget {
    /** Returns the transaction's connection. */
    val db: IDBDatabase
    val durability: IDBTransactionDurability

    /** If the transaction was aborted, returns the error (a DOMException) providing the reason. */
    val error: DOMException?

    /** Returns the mode the transaction was created with ("readonly" or "readwrite"), or "versionchange" for an upgrade transaction. */
    val mode: IDBTransactionMode

    /** Returns a list of the names of object stores in the transaction's scope. For an upgrade transaction this is all object stores in the database. */
    val objectStoreNames: DOMStringList
    var onabort: EventHandler<Event>?
    var oncomplete: EventHandler<Event>?
    var onerror: EventHandler<Event>?

    /** Aborts the transaction. All pending requests will fail with a "AbortError" DOMException and all changes made to the database will be reverted. */
    fun abort()
    fun commit()

    /** Returns an IDBObjectStore in the transaction's scope. */
    fun objectStore(name: String): IDBObjectStore
}
