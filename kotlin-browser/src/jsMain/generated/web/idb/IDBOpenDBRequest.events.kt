// Automatically generated - do not modify!

package web.idb

import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/blocked_event)
 */
inline val <C : IDBOpenDBRequest> C.blockedEvent: EventInstance<IDBVersionChangeEvent, C, C>
    get() = EventInstance(this, IDBVersionChangeEvent.BLOCKED)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/success_event)
 */
inline val <C : IDBOpenDBRequest> C.successEvent: EventInstance<IDBVersionChangeEvent, C, C>
    get() = EventInstance(this, IDBVersionChangeEvent.SUCCESS)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/upgradeneeded_event)
 */
inline val <C : IDBOpenDBRequest> C.upgradeneededEvent: EventInstance<IDBVersionChangeEvent, C, C>
    get() = EventInstance(this, IDBVersionChangeEvent.UPGRADENEEDED)
