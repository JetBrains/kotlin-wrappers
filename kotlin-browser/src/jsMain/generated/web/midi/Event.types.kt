// Automatically generated - do not modify!

package web.midi

import web.events.Event
import web.events.EventType

inline val Event.Companion.MIDI_MESSAGE: EventType<Event>
    get() = EventType("midimessage")

inline val Event.Companion.STATE_CHANGE: EventType<Event>
    get() = EventType("statechange")
