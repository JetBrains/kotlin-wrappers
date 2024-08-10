// Automatically generated - do not modify!

package web.html

import web.dom.cueChange
import web.dom.load
import web.events.Event
import web.events.EventInstance

inline val <C : HTMLTrackElement> C.cueChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.cueChange())

inline val <C : HTMLTrackElement> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.error())

inline val <C : HTMLTrackElement> C.loadEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.load())
