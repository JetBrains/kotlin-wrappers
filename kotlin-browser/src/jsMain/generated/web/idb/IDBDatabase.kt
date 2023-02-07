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
    /** Returns the name of the database. */
    val name: String

    /** Returns a list of the names of object stores in the database. */
    val objectStoreNames: DOMStringList
    var onabort: EventHandler<Event>?
    var onclose: EventHandler<Event>?
    var onerror: EventHandler<Event>?
    var onversionchange: EventHandler<IDBVersionChangeEvent>?

    /** Returns the version of the database. */
    val version: JsLong

    /** Closes the connection once all running transactions have finished. */
    fun close()

    /**
     * Creates a new object store with the given name and options and returns a new IDBObjectStore.
     *
     * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
     */
    fun createObjectStore(
        name: String,
        options: IDBObjectStoreParameters = definedExternally,
    ): IDBObjectStore

    /**
     * Deletes the object store with the given name.
     *
     * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
     */
    fun deleteObjectStore(name: String)

    /** Returns a new transaction with the given mode ("readonly" or "readwrite") and scope which can be a single object store name or an array of names. */
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
