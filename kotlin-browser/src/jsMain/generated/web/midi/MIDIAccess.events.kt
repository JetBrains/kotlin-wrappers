// Automatically generated - do not modify!

package web.midi

import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess/statechange_event)
 */
inline val <C : MIDIAccess> C.stateChangeEvent: EventInstance<MIDIConnectionEvent, C, C>
    get() = EventInstance(this, MIDIConnectionEvent.stateChange())
