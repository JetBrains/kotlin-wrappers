// Automatically generated - do not modify!

package web.midi

import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`MIDIConnectionEvent`** interface of the Web MIDI API is the event passed to the statechange event of the MIDIAccess interface and the statechange event of the MIDIPort interface. This occurs any time a new port becomes available, or when a previously available port becomes unavailable. For example, this event is fired whenever a MIDI device is either plugged in to or unplugged from a computer.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIConnectionEvent)
 */
open external class MIDIConnectionEvent(
    override val type: EventType<MIDIConnectionEvent>,
    init: MIDIConnectionEventInit = definedExternally,
) : Event {
    /**
     * The **`port`** read-only property of the MIDIConnectionEvent interface returns the port that has been disconnected or connected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIConnectionEvent/port)
     */
    val port: MIDIPort?

    companion object
}

inline val MIDIConnectionEvent.Companion.STATE_CHANGE: EventType<MIDIConnectionEvent>
    get() = EventType("statechange")
