// Automatically generated - do not modify!

package web.midi

import seskar.js.JsValue
import web.events.EventType

sealed external class MIDIMessageEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MIDIMessageEvent.MIDI_MESSAGE"),
    )
    @JsValue("midimessage")
    fun midiMessage(): EventType<MIDIMessageEvent>
}
