// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.midi

import web.events.Event
import web.events.EventInit
import web.events.EventType

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIConnectionEvent)
 */
external interface MIDIConnectionEventInit : EventInit {
    var port: MIDIPort?
}

open external class MIDIConnectionEvent(
    override val type: EventType<MIDIConnectionEvent>,
    init: MIDIConnectionEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIConnectionEvent/port) */
    val port: MIDIPort

    companion object
}
