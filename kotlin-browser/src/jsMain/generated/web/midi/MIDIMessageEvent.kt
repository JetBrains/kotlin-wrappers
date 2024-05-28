// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.midi

import js.typedarrays.Uint8Array
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIMessageEvent)
 */
open external class MIDIMessageEvent(
    override val type: EventType<MIDIMessageEvent, EventTarget>,
    init: MIDIMessageEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIMessageEvent/data)
     */
    val data: Uint8Array?

    @JsAlias(THIS)
    override fun asInit(): MIDIMessageEventInit

    companion object : MIDIMessageEventTypes
}
