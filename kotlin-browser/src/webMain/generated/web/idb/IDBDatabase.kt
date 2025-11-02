// Automatically generated - do not modify!

package web.idb

import js.array.ReadonlyArray
import js.closeable.JsCloseable
import js.core.UInt53
import web.dom.DOMStringList
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * The **`IDBDatabase`** interface of the IndexedDB API provides a connection to a database; you can use an IDBDatabase object to open a transaction on your database then create, manipulate, and delete objects (data) in that database. The interface provides the only way to get and manage versions of the database.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase)
 */
open external class IDBDatabase
private constructor() :
    EventTarget,
    JsCloseable {
    /**
     * The **`name`** read-only property of the IDBDatabase interface is a string that contains the name of the connected database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/name)
     */
    val name: String

    /**
     * The **`objectStoreNames`** read-only property of the IDBDatabase interface is a DOMStringList containing a list of the names of the object stores currently in the connected database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/objectStoreNames)
     */
    val objectStoreNames: DOMStringList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/abort_event)
     */
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
     * The **`version`** property of the IDBDatabase interface is a 64-bit integer that contains the version of the connected database. When a database is first created, this attribute is an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/version)
     */
    val version: UInt53

    /**
     * The **`close()`** method of the IDBDatabase interface returns immediately and closes the connection in a separate thread.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/close)
     */
    override fun close()

    /**
     * The **`createObjectStore()`** method of the IDBDatabase interface creates and returns a new IDBObjectStore.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/createObjectStore)
     */
    fun createObjectStore(
        name: String,
        options: IDBObjectStoreParameters = definedExternally,
    ): IDBObjectStore

    /**
     * The **`deleteObjectStore()`** method of the IDBDatabase interface destroys the object store with the given name in the connected database, along with any indexes that reference it.
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
inline val <C : IDBDatabase> C.abortEvent: EventInstance<Event, C, IDBDatabase>
    get() = EventInstance(this, "abort")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/close_event)
 */
inline val <C : IDBDatabase> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "close")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/error_event)
 */
inline val <C : IDBDatabase> C.errorEvent: EventInstance<Event, C, IDBTransaction>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/versionchange_event)
 */
inline val <C : IDBDatabase> C.versionChangeEvent: EventInstance<IDBVersionChangeEvent, C, C>
    get() = EventInstance(this, "versionchange")
