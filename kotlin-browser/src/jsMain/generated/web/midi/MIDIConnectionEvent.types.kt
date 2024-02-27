// Automatically generated - do not modify!

package web.midi

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class MIDIConnectionEventTypes :
    MIDIConnectionEventTypes_deprecated {

    @JsValue("statechange")
    fun <C : EventTarget> stateChange(): EventType<MIDIConnectionEvent<C>>
}
