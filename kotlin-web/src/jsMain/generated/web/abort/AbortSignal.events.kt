// Automatically generated - do not modify!

package web.abort

import web.events.Event
import web.events.EventInstance

inline val <C : AbortSignal> C.abortEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.abort())
