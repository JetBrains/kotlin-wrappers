// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.midi

import js.typedarrays.Uint8Array
import web.events.Event
import web.events.EventInit
import web.events.EventType

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIMessageEvent)
 */
external interface MIDIMessageEventInit : EventInit {
    var data: Uint8Array?
}

open external class MIDIMessageEvent(
    override val type: EventType<MIDIMessageEvent>,
    init: MIDIMessageEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIMessageEvent/data) */
    val data: Uint8Array

    companion object
}
