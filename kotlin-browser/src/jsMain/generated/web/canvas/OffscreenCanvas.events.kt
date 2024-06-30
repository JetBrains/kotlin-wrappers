// Automatically generated - do not modify!

package web.canvas

import web.events.Event
import web.events.EventInstance

inline val <C : OffscreenCanvas> C.contextLostEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.contextLost())

inline val <C : OffscreenCanvas> C.contextRestoredEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.contextRestored())
