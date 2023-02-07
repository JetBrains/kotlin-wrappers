// Automatically generated - do not modify!

package web.audio

import web.events.Event
import web.events.EventType

inline val Event.Companion.ENDED: EventType<Event>
    get() = EventType("ended")

inline val Event.Companion.PROCESS_OR_ERROR: EventType<Event>
    get() = EventType("processorerror")

inline val Event.Companion.STATE_CHANGE: EventType<Event>
    get() = EventType("statechange")
