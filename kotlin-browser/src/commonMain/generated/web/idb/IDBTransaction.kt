// Automatically generated - do not modify!

package web.idb

import web.dom.DOMStringList
import web.errors.DOMException
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * The **`IDBTransaction`** interface of the IndexedDB API provides a static, asynchronous transaction on a database using event handler attributes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction)
 */
open external class IDBTransaction
private constructor() :
    EventTarget {
    /**
     * The **`db`** read-only property of the IDBTransaction interface returns the database connection with which this transaction is associated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/db)
     */
    val db: IDBDatabase

    /**
     * The **`durability`** read-only property of the IDBTransaction interface returns the durability hint the transaction was created with.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/durability)
     */
    val durability: IDBTransactionDurability

    /**
     * The **`IDBTransaction.error`** property of the IDBTransaction interface returns the type of error when there is an unsuccessful transaction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/error)
     */
    val error: DOMException?

    /**
     * The **`mode`** read-only property of the IDBTransaction interface returns the current mode for accessing the data in the object stores in the scope of the transaction (i.e., is the mode to be read-only, or do you want to write to the object stores?) The default value is `readonly`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/mode)
     */
    val mode: IDBTransactionMode

    /**
     * The **`objectStoreNames`** read-only property of the IDBTransaction interface returns a DOMStringList of names of IDBObjectStore objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/objectStoreNames)
     */
    val objectStoreNames: DOMStringList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/abort_event)
     */
    var onabort: EventHandler<Event, IDBTransaction, IDBDatabase>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/complete_event)
     */
    var oncomplete: EventHandler<Event, IDBTransaction, IDBTransaction>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/error_event)
     */
    var onerror: EventHandler<Event, IDBTransaction, IDBTransaction>?

    /**
     * The **`abort()`** method of the IDBTransaction interface rolls back all the changes to objects in the database associated with this transaction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/abort)
     */
    fun abort()

    /**
     * The **`commit()`** method of the IDBTransaction interface commits the transaction if it is called on an active transaction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/commit)
     */
    fun commit()

    /**
     * The **`objectStore()`** method of the IDBTransaction interface returns an object store that has already been added to the scope of this transaction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/objectStore)
     */
    fun objectStore(name: String): IDBObjectStore
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/abort_event)
 */
inline val <C : IDBTransaction> C.abortEvent: EventInstance<Event, C, IDBDatabase>
    get() = EventInstance(this, "abort")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/complete_event)
 */
inline val <C : IDBTransaction> C.completeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "complete")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/error_event)
 */
inline val <C : IDBTransaction> C.errorEvent: EventInstance<Event, C, IDBTransaction>
    get() = EventInstance(this, "error")
