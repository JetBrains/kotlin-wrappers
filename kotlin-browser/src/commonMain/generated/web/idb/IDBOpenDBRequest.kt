// Automatically generated - do not modify!

package web.idb

import web.events.EventHandler
import web.events.EventInstance

/**
 * The **`IDBOpenDBRequest`** interface of the IndexedDB API provides access to the results of requests to open or delete databases (performed using IDBFactory.open and IDBFactory.deleteDatabase), using specific event handler attributes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest)
 */
external class IDBOpenDBRequest
private constructor() :
    IDBRequest<IDBDatabase> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/blocked_event)
     */
    var onblocked: EventHandler<IDBVersionChangeEvent, IDBOpenDBRequest, IDBOpenDBRequest>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/upgradeneeded_event)
     */
    var onupgradeneeded: EventHandler<IDBVersionChangeEvent, IDBOpenDBRequest, IDBOpenDBRequest>?
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/blocked_event)
 */
inline val <C : IDBOpenDBRequest> C.blockedEvent: EventInstance<IDBVersionChangeEvent, C, C>
    get() = EventInstance(this, "blocked")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/success_event)
 */
inline val <C : IDBOpenDBRequest> C.successEvent: EventInstance<IDBVersionChangeEvent, C, C>
    get() = EventInstance(this, "success")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/upgradeneeded_event)
 */
inline val <C : IDBOpenDBRequest> C.upgradeneededEvent: EventInstance<IDBVersionChangeEvent, C, C>
    get() = EventInstance(this, "upgradeneeded")
