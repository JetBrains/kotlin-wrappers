// Automatically generated - do not modify!

package web.idb

import web.events.EventInstance

inline val <C : IDBOpenDBRequest> C.blockedEvent: EventInstance<IDBVersionChangeEvent, C, C>
    get() = EventInstance(this, IDBVersionChangeEvent.blocked())

inline val <C : IDBOpenDBRequest> C.successEvent: EventInstance<IDBVersionChangeEvent, C, C>
    get() = EventInstance(this, IDBVersionChangeEvent.success())

inline val <C : IDBOpenDBRequest> C.upgradeneededEvent: EventInstance<IDBVersionChangeEvent, C, C>
    get() = EventInstance(this, IDBVersionChangeEvent.upgradeneeded())
