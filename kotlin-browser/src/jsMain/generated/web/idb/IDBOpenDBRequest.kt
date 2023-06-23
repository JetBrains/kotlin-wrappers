// Automatically generated - do not modify!

package web.idb

import web.events.EventHandler

/**
 * Also inherits methods from its parents IDBRequest and EventTarget.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest)
 */
sealed external class IDBOpenDBRequest :
    IDBRequest<IDBDatabase> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/blocked_event) */
    var onblocked: EventHandler<IDBVersionChangeEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/upgradeneeded_event) */
    var onupgradeneeded: EventHandler<IDBVersionChangeEvent>?
}
