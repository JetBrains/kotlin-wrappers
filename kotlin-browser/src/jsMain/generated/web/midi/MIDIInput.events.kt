// Automatically generated - do not modify!

package web.midi

import web.events.EventInstance
import web.events.EventType

inline val <C : MIDIInput> C.midiMessageEvent: EventInstance<MIDIMessageEvent, C, C>
    get() = EventInstance(this, EventType("midimessage"))
