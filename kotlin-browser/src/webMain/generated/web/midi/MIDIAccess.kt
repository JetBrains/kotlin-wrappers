// Automatically generated - do not modify!

package web.midi

import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * The **`MIDIAccess`** interface of the Web MIDI API provides methods for listing MIDI input and output devices, and obtaining access to those devices.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess)
 */
open external class MIDIAccess
private constructor() :
    EventTarget {
    /**
     * The **`inputs`** read-only property of the MIDIAccess interface provides access to any available MIDI input ports.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess/inputs)
     */
    val inputs: MIDIInputMap

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess/statechange_event)
     */
    var onstatechange: EventHandler<MIDIConnectionEvent, MIDIAccess, MIDIAccess>?

    /**
     * The **`outputs`** read-only property of the MIDIAccess interface provides access to any available MIDI output ports.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess/outputs)
     */
    val outputs: MIDIOutputMap

    /**
     * The **`sysexEnabled`** read-only property of the MIDIAccess interface indicates whether system exclusive support is enabled on the current MIDIAccess instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess/sysexEnabled)
     */
    val sysexEnabled: Boolean
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess/statechange_event)
 */
inline val <C : MIDIAccess> C.stateChangeEvent: EventInstance<MIDIConnectionEvent, C, C>
    get() = EventInstance(this, "statechange")
