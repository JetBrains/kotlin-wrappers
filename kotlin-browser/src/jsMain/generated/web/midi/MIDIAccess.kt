// Automatically generated - do not modify!

package web.midi

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess)
 */
sealed external class MIDIAccess :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess/inputs) */
    val inputs: MIDIInputMap

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess/statechange_event) */
    var onstatechange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess/outputs) */
    val outputs: MIDIOutputMap

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess/sysexEnabled) */
    val sysexEnabled: Boolean
}
