// Automatically generated - do not modify!

package web.midi

import web.events.EventInstance

inline val <C : MIDIPort> C.stateChangeEvent: EventInstance<MIDIConnectionEvent, C, C>
    get() = EventInstance(this, MIDIConnectionEvent.stateChange())
