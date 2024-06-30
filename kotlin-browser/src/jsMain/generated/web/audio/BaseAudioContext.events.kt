// Automatically generated - do not modify!

package web.audio

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : BaseAudioContext> C.stateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("statechange"))
