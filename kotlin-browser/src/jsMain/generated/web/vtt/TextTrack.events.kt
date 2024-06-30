// Automatically generated - do not modify!

package web.vtt

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : TextTrack> C.cueChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("cuechange"))
