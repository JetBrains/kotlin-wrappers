// Automatically generated - do not modify!

package web.midi

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class MIDIConnectionEventTypes {

    @JsValue("statechange")
    fun <C : EventTarget> stateChange(): EventType<MIDIConnectionEvent, C>
}
