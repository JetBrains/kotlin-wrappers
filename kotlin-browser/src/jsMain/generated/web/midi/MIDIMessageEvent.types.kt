// Automatically generated - do not modify!

package web.midi

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class MIDIMessageEventTypes {

    @JsValue("midimessage")
    fun <C : EventTarget> midiMessage(): EventType<MIDIMessageEvent, C>
}
