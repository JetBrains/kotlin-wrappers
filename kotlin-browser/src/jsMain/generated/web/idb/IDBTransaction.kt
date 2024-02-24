// Automatically generated - do not modify!

package web.idb

import web.dom.DOMStringList
import web.errors.DOMException
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction)
 */
sealed external class IDBTransaction :
    EventTarget {
    /**
     * Returns the transaction's connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/db)
     */
    val db: IDBDatabase

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/durability)
     */
    val durability: IDBTransactionDurability

    /**
     * If the transaction was aborted, returns the error (a DOMException) providing the reason.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/error)
     */
    val error: DOMException?

    /**
     * Returns the mode the transaction was created with ("readonly" or "readwrite"), or "versionchange" for an upgrade transaction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/mode)
     */
    val mode: IDBTransactionMode

    /**
     * Returns a list of the names of object stores in the transaction's scope. For an upgrade transaction this is all object stores in the database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/objectStoreNames)
     */
    val objectStoreNames: DOMStringList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/abort_event)
     */
    var onabort: EventHandler<Event<IDBTransaction>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/complete_event)
     */
    var oncomplete: EventHandler<Event<IDBTransaction>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/error_event)
     */
    var onerror: EventHandler<Event<IDBTransaction>>?

    /**
     * Aborts the transaction. All pending requests will fail with a "AbortError" DOMException and all changes made to the database will be reverted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/abort)
     */
    fun abort()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/commit)
     */
    fun commit()

    /**
     * Returns an IDBObjectStore in the transaction's scope.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/objectStore)
     */
    fun objectStore(name: String): IDBObjectStore
}
