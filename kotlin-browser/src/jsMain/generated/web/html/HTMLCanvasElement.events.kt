// Automatically generated - do not modify!

package web.html

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : HTMLCanvasElement> C.contextLostEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("contextlost"))

inline val <C : HTMLCanvasElement> C.contextRestoredEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("contextrestored"))
