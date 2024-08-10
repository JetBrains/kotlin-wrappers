// Automatically generated - do not modify!

package web.workers

import web.events.Event
import web.events.EventInstance

inline val <C : SharedWorker> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.error())
