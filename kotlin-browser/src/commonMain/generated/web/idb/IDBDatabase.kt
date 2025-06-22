// Automatically generated - do not modify!

package web.idb

import js.array.ReadonlyArray
import js.core.JsString
import js.core.UInt53
import web.dom.DOMStringList
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.definedExternally

/**
 * The **`IDBDatabase`** interface of the IndexedDB API provides a connection to a database; you can use an `IDBDatabase` object to open a transaction on your database then create, manipulate, and delete objects (data) in that database.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase)
 */
external class IDBDatabase
private constructor() :
    EventTarget {
    /**
     * The **`name`** read-only property of the `IDBDatabase` interface is a string that contains the name of the connected database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/name)
     */
    val name: String

    /**
     * The **`objectStoreNames`** read-only property of the list of the names of the object stores currently in the connected database.
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
     * The **`version`** property of the IDBDatabase interface is a 64-bit integer that contains the version of the connected database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/version)
     */
    val version: UInt53

    /**
     * The **`close()`** method of the IDBDatabase interface returns immediately and closes the connection in a separate thread.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/close)
     */
    fun close()

    /**
     * The **`createObjectStore()`** method of the The method takes the name of the store as well as a parameter object that lets you define important optional properties.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/createObjectStore)
     */
    fun createObjectStore(
        name: String,
        options: IDBObjectStoreParameters = definedExternally,
    ): IDBObjectStore

    /**
     * The **`deleteObjectStore()`** method of the the connected database, along with any indexes that reference it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/deleteObjectStore)
     */
    fun deleteObjectStore(name: String)

    /**
     * The **`transaction`** method of the IDBDatabase interface immediately returns a transaction object (IDBTransaction) containing the IDBTransaction.objectStore method, which you can use to access your object store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/transaction)
     */
    fun transaction(
        storeNames: String,
        mode: IDBTransactionMode = definedExternally,
        options: IDBTransactionOptions = definedExternally,
    ): IDBTransaction

    fun transaction(
        storeNames: ReadonlyArray<JsString>,
        mode: IDBTransactionMode = definedExternally,
        options: IDBTransactionOptions = definedExternally,
    ): IDBTransaction
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/abort_event)
 */
inline val IDBDatabase.abortEvent: EventInstance<Event, IDBDatabase, IDBDatabase>
    get() = EventInstance(this, "abort")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/close_event)
 */
inline val IDBDatabase.closeEvent: EventInstance<Event, IDBDatabase, IDBDatabase>
    get() = EventInstance(this, "close")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/error_event)
 */
inline val IDBDatabase.errorEvent: EventInstance<Event, IDBDatabase, IDBTransaction>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/versionchange_event)
 */
inline val IDBDatabase.versionChangeEvent: EventInstance<IDBVersionChangeEvent, IDBDatabase, IDBDatabase>
    get() = EventInstance(this, "versionchange")
