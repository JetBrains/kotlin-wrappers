// Automatically generated - do not modify!

package web.idb

import js.array.ReadonlyArray
import js.core.JsLong
import web.dom.DOMStringList
import web.events.*

/**
 * This IndexedDB API interface provides a connection to a database; you can use an IDBDatabase object to open a transaction on your database then create, manipulate, and delete objects (data) in that database. The interface provides the only way to get and manage versions of the database.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase)
 */
external class IDBDatabase
private constructor() :
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
    var onabort: EventHandler<Event, IDBDatabase, IDBDatabase>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/close_event)
     */
    var onclose: EventHandler<Event, IDBDatabase, IDBDatabase>?
    var onerror: EventHandler<Event, IDBDatabase, IDBTransaction>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/versionchange_event)
     */
    var onversionchange: EventHandler<IDBVersionChangeEvent, IDBDatabase, IDBDatabase>?

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

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/abort_event)
     */
    @JsEvent("abort")
    val abortEvent: EventInstance<Event, IDBDatabase /* this */, IDBDatabase>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/close_event)
     */
    @JsEvent("close")
    val closeEvent: EventInstance<Event, IDBDatabase /* this */, IDBDatabase /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/error_event)
     */
    @JsEvent("error")
    val errorEvent: EventInstance<Event, IDBDatabase /* this */, IDBTransaction>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/versionchange_event)
     */
    @JsEvent("versionchange")
    val versionChangeEvent: EventInstance<IDBVersionChangeEvent, IDBDatabase /* this */, IDBDatabase /* this */>
}
