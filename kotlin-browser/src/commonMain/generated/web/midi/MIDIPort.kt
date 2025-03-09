// Automatically generated - do not modify!

package web.midi

import js.promise.Promise
import seskar.js.JsAsync
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.events.JsEvent

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort)
 */
open external class MIDIPort
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/connection)
     */
    val connection: MIDIPortConnectionState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/id)
     */
    val id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/manufacturer)
     */
    val manufacturer: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/name)
     */
    val name: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/statechange_event)
     */
    var onstatechange: EventHandler<MIDIConnectionEvent, MIDIPort, MIDIPort>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/state)
     */
    val state: MIDIPortDeviceState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/type)
     */
    val type: MIDIPortType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/version)
     */
    val version: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/close)
     */
    @JsAsync
    suspend fun close(): MIDIPort

    @JsName("close")
    fun closeAsync(): Promise<MIDIPort>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/open)
     */
    @JsAsync
    suspend fun open(): MIDIPort

    @JsName("open")
    fun openAsync(): Promise<MIDIPort>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/statechange_event)
     */
    @JsEvent("statechange")
    val stateChangeEvent: EventInstance<MIDIConnectionEvent, MIDIPort /* this */, MIDIPort /* this */>
}
