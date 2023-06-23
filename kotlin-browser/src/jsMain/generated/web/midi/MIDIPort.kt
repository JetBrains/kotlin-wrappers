// Automatically generated - do not modify!

package web.midi

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort)
 */
sealed external class MIDIPort :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/connection) */
    val connection: MIDIPortConnectionState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/id) */
    val id: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/manufacturer) */
    val manufacturer: String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/name) */
    val name: String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/statechange_event) */
    var onstatechange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/state) */
    val state: MIDIPortDeviceState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/type) */
    val type: MIDIPortType

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/version) */
    val version: String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/close) */
    fun close(): Promise<MIDIPort>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/open) */
    fun open(): Promise<MIDIPort>
}
