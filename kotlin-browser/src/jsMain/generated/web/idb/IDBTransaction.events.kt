// Automatically generated - do not modify!

package web.idb

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/abort_event)
 */
inline val <C : IDBTransaction> C.abortEvent: EventInstance<Event, C, IDBDatabase>
    get() = EventInstance(this, Event.ABORT)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/complete_event)
 */
inline val <C : IDBTransaction> C.completeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.COMPLETE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/error_event)
 */
inline val <C : IDBTransaction> C.errorEvent: EventInstance<Event, C, IDBTransaction>
    get() = EventInstance(this, Event.ERROR)
