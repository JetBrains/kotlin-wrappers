// Automatically generated - do not modify!

package web.midi

import web.events.Event
import web.events.EventHandler

sealed external class MIDIInput :
    MIDIPort {
    var onmidimessage: EventHandler<Event>?
}
