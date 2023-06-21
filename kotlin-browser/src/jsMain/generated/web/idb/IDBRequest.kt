// Automatically generated - do not modify!

package web.idb

import web.errors.DOMException
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class IDBRequest<T> :
    EventTarget {
    /**
     * When a request is completed, returns the error (a DOMException), or null if the request succeeded. Throws a "InvalidStateError" DOMException if the request is still pending.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/error)
     */
    val error: DOMException?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/error_event) */
    var onerror: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/success_event) */
    var onsuccess: EventHandler<Event>?

    /**
     * Returns "pending" until a request is complete, then returns "done".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/readyState)
     */
    val readyState: IDBRequestReadyState

    /**
     * When a request is completed, returns the result, or undefined if the request failed. Throws a "InvalidStateError" DOMException if the request is still pending.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/result)
     */
    val result: T

    /**
     * Returns the IDBObjectStore, IDBIndex, or IDBCursor the request was made against, or null if is was an open request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/source)
     */
    val source: Any /* IDBObjectStore | IDBIndex | IDBCursor */

    /**
     * Returns the IDBTransaction the request was made within. If this as an open request, then it returns an upgrade transaction while it is running, or null otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/transaction)
     */
    val transaction: IDBTransaction?
}
