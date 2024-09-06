// Automatically generated - do not modify!

package web.midi

import seskar.js.JsValue
import web.events.EventType

sealed external class MIDIConnectionEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MIDIConnectionEvent.STATE_CHANGE"),
    )
    @JsValue("statechange")
    fun stateChange(): EventType<MIDIConnectionEvent>
}
