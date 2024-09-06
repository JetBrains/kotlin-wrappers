// Automatically generated - do not modify!

package web.midi

import seskar.js.JsValue
import web.events.EventType

sealed external class MIDIConnectionEventTypes :
    MIDIConnectionEventTypes_deprecated {

    @JsValue("statechange")
    val STATE_CHANGE: EventType<MIDIConnectionEvent>
}
