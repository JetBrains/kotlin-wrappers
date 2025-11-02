// Automatically generated - do not modify!

package web.idb

import web.errors.DOMException
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.JsAny

/**
 * The **`IDBRequest`** interface of the IndexedDB API provides access to results of asynchronous requests to databases and database objects using event handler attributes. Each reading and writing operation on a database is done using a request.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest)
 */
open external class IDBRequest<T : JsAny?>
private constructor() :
    EventTarget {
    /**
     * The **`error`** read-only property of the IDBRequest interface returns the error in the event of an unsuccessful request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/error)
     */
    val error: DOMException?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/error_event)
     */
    var onerror: EventHandler<Event, IDBRequest<T>, IDBTransaction>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/success_event)
     */
    var onsuccess: EventHandler<Event, IDBRequest<T>, IDBRequest<T>>?

    /**
     * The **`readyState`** read-only property of the IDBRequest interface returns the state of the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/readyState)
     */
    val readyState: IDBRequestReadyState

    /**
     * The **`result`** read-only property of the IDBRequest interface returns the result of the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/result)
     */
    val result: T

    /**
     * The **`source`** read-only property of the IDBRequest interface returns the source of the request, such as an Index or an object store. If no source exists (such as when calling IDBFactory.open), it returns null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/source)
     */
    val source: JsAny /* IDBObjectStore | IDBIndex | IDBCursor */

    /**
     * The **`transaction`** read-only property of the IDBRequest interface returns the transaction for the request, that is, the transaction the request is being made inside.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/transaction)
     */
    val transaction: IDBTransaction?
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/error_event)
 */
inline val <C : IDBRequest<*>> C.errorEvent: EventInstance<Event, C, IDBTransaction>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/success_event)
 */
inline val <C : IDBRequest<*>> C.successEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "success")
