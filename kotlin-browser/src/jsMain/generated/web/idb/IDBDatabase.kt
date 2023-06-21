// Automatically generated - do not modify!

package web.idb

import js.core.JsLong
import js.core.ReadonlyArray
import web.dom.DOMStringList
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class IDBDatabase :
    EventTarget {
    /**
     * Returns the name of the database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/name)
     */
    val name: String

    /**
     * Returns a list of the names of object stores in the database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/objectStoreNames)
     */
    val objectStoreNames: DOMStringList
    var onabort: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/close_event) */
    var onclose: EventHandler<Event>?
    var onerror: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/versionchange_event) */
    var onversionchange: EventHandler<IDBVersionChangeEvent>?

    /**
     * Returns the version of the database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/version)
     */
    val version: JsLong

    /**
     * Closes the connection once all running transactions have finished.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/close)
     */
    fun close()

    /**
     * Creates a new object store with the given name and options and returns a new IDBObjectStore.
     *
     * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/createObjectStore)
     */
    fun createObjectStore(
        name: String,
        options: IDBObjectStoreParameters = definedExternally,
    ): IDBObjectStore

    /**
     * Deletes the object store with the given name.
     *
     * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/deleteObjectStore)
     */
    fun deleteObjectStore(name: String)

    /**
     * Returns a new transaction with the given mode ("readonly" or "readwrite") and scope which can be a single object store name or an array of names.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/transaction)
     */
    fun transaction(
        storeNames: String,
        mode: IDBTransactionMode = definedExternally,
        options: IDBTransactionOptions = definedExternally,
    ): IDBTransaction

    fun transaction(
        storeNames: ReadonlyArray<String>,
        mode: IDBTransactionMode = definedExternally,
        options: IDBTransactionOptions = definedExternally,
    ): IDBTransaction
}
