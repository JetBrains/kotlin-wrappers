// Automatically generated - do not modify!

package web.midi

import js.typedarrays.Uint8Array
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`MIDIMessageEvent`** interface of the Web MIDI API represents the event passed to the MIDIInput.midimessage_event event of the MIDIInput interface.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIMessageEvent)
 */
open external class MIDIMessageEvent(
    override val type: EventType<MIDIMessageEvent>,
    init: MIDIMessageEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIMessageEvent/data)
     */
    val data: Uint8Array<*>?

    @JsAlias(THIS)
    override fun asInit(): MIDIMessageEventInit

    companion object {
        @JsValue("midimessage")
        val MIDI_MESSAGE: EventType<MIDIMessageEvent>
    }
}
