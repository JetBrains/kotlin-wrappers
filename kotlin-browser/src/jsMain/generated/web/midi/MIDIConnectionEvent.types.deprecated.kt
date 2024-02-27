// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.midi

import seskar.js.JsValue
import web.events.EventType

sealed external interface MIDIConnectionEventTypes_deprecated {
    @JsValue("statechange")
    val STATE_CHANGE: EventType<MIDIConnectionEvent<*>>
        get() = definedExternally
}
