// Automatically generated - do not modify!

package web.midi

import web.events.EventInstance
import web.events.EventType

inline val <C : MIDIPort> C.stateChangeEvent: EventInstance<MIDIConnectionEvent, C, C>
    get() = EventInstance(this, EventType("statechange"))
