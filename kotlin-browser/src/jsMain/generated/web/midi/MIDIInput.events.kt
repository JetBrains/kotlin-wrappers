// Automatically generated - do not modify!

package web.midi

import web.events.EventInstance

inline val <C : MIDIInput> C.midiMessageEvent: EventInstance<MIDIMessageEvent, C, C>
    get() = EventInstance(this, MIDIMessageEvent.midiMessage())
