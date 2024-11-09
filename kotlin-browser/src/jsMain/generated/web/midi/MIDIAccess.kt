// Automatically generated - do not modify!

package web.midi

import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.events.JsEvent

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess)
 */
external class MIDIAccess
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess/inputs)
     */
    val inputs: MIDIInputMap

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess/statechange_event)
     */
    var onstatechange: EventHandler<MIDIConnectionEvent, MIDIAccess, MIDIAccess>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess/outputs)
     */
    val outputs: MIDIOutputMap

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess/sysexEnabled)
     */
    val sysexEnabled: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIAccess/statechange_event)
     */
    @JsEvent("statechange")
    val stateChangeEvent: EventInstance<MIDIConnectionEvent, MIDIAccess /* this */, MIDIAccess /* this */>
}
