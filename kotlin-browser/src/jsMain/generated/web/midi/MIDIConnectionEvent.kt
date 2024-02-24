// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.midi

import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIConnectionEvent)
 */
open external class MIDIConnectionEvent<out C : EventTarget?>(
    override val type: EventType<MIDIConnectionEvent<*>>,
    init: MIDIConnectionEventInit = definedExternally,
) : Event<C>,
    MIDIConnectionEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIConnectionEvent/port)
     */
    override val port: MIDIPort?

    companion object : MIDIConnectionEventTypes
}
