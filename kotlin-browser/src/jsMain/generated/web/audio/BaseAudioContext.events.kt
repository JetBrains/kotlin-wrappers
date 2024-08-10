// Automatically generated - do not modify!

package web.audio

import web.events.Event
import web.events.EventInstance

inline val <C : BaseAudioContext> C.stateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.stateChange())
