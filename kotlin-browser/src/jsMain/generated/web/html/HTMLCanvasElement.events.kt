// Automatically generated - do not modify!

package web.html

import web.dom.contextLost
import web.dom.contextRestored
import web.events.Event
import web.events.EventInstance

inline val <C : HTMLCanvasElement> C.contextLostEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.contextLost())

inline val <C : HTMLCanvasElement> C.contextRestoredEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.contextRestored())
