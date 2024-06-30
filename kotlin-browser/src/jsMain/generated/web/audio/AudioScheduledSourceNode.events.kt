// Automatically generated - do not modify!

package web.audio

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : AudioScheduledSourceNode> C.endedEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("ended"))
