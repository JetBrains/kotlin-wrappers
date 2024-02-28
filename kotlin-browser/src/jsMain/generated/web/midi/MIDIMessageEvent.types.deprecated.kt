// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.midi

import seskar.js.JsValue
import web.events.EventType

sealed external interface MIDIMessageEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MIDIMessageEvent.midiMessage()"),
    )
    @JsValue("midimessage")
    val MIDI_MESSAGE: EventType<MIDIMessageEvent<*>>
        get() = definedExternally
}
