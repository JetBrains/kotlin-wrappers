// Automatically generated - do not modify!

package web.midi

import js.reflect.unsafeCast
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`MIDIConnectionEvent`** interface of the Web MIDI API is the event passed to the MIDIAccess.statechange_event event of the MIDIAccess interface and the MIDIPort.statechange_event event of the MIDIPort interface.
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

    companion object {
        @JsValue("statechange")
        val STATE_CHANGE: EventType<MIDIConnectionEvent>
    }
}

inline fun MIDIConnectionEvent.asInit(): MIDIConnectionEventInit =
    unsafeCast(this)
