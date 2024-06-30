// Automatically generated - do not modify!

package web.viewport

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : VisualViewport> C.resizeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("resize"))

inline val <C : VisualViewport> C.scrollEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("scroll"))

inline val <C : VisualViewport> C.scrollEndEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("scrollend"))
