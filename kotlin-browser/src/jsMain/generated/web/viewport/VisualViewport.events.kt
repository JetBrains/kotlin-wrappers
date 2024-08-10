// Automatically generated - do not modify!

package web.viewport

import web.dom.scroll
import web.dom.scrollEnd
import web.events.Event
import web.events.EventInstance
import web.window.resize

inline val <C : VisualViewport> C.resizeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.resize())

inline val <C : VisualViewport> C.scrollEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.scroll())

inline val <C : VisualViewport> C.scrollEndEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.scrollEnd())
