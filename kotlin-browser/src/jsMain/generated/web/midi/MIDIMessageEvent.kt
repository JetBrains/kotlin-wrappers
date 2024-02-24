// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.midi

import js.typedarrays.Uint8Array
import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIMessageEvent)
 */
open external class MIDIMessageEvent<out C : EventTarget?>(
    override val type: EventType<MIDIMessageEvent<*>>,
    init: MIDIMessageEventInit = definedExternally,
) : Event<C>,
    MIDIMessageEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIMessageEvent/data)
     */
    override val data: Uint8Array?

    companion object : MIDIMessageEventTypes
}
