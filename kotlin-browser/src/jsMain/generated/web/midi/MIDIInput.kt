// Automatically generated - do not modify!

package web.midi

import web.events.Event
import web.events.EventHandler

sealed external class MIDIInput :
    MIDIPort {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIInput/midimessage_event) */
    var onmidimessage: EventHandler<Event>?
}
