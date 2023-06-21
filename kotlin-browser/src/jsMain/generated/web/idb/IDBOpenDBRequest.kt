// Automatically generated - do not modify!

package web.idb

import web.events.EventHandler

sealed external class IDBOpenDBRequest :
    IDBRequest<IDBDatabase> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/blocked_event) */
    var onblocked: EventHandler<IDBVersionChangeEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/upgradeneeded_event) */
    var onupgradeneeded: EventHandler<IDBVersionChangeEvent>?
}
