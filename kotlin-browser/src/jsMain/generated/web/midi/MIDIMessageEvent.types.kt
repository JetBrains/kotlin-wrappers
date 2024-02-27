// Automatically generated - do not modify!

package web.midi

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class MIDIMessageEventTypes :
    MIDIMessageEventTypes_deprecated {

    @JsValue("midimessage")
    fun <C : EventTarget> midiMessage(): EventType<MIDIMessageEvent<C>>
}
