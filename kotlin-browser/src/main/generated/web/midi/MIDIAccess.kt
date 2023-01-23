// Automatically generated - do not modify!

package web.midi

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class MIDIAccess :
    EventTarget {
    val inputs: MIDIInputMap
    var onstatechange: EventHandler<Event>?
    val outputs: MIDIOutputMap
    val sysexEnabled: Boolean
}
