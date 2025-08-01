// Automatically generated - do not modify!

package web.midi

import js.promise.Promise
import js.promise.await
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.JsName

/**
 * The **`MIDIPort`** interface of the Web MIDI API represents a MIDI input or output port.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort)
 */
open external class MIDIPort
private constructor() :
    EventTarget {
    /**
     * The **`connection`** read-only property of the MIDIPort interface returns the connection state of the port.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/connection)
     */
    val connection: MIDIPortConnectionState

    /**
     * The **`id`** read-only property of the MIDIPort interface returns the unique ID of the port.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/id)
     */
    val id: String

    /**
     * The **`manufacturer`** read-only property of the MIDIPort interface returns the manufacturer of the port.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/manufacturer)
     */
    val manufacturer: String?

    /**
     * The **`name`** read-only property of the MIDIPort interface returns the system name of the port.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/name)
     */
    val name: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/statechange_event)
     */
    var onstatechange: EventHandler<MIDIConnectionEvent, MIDIPort, MIDIPort>?

    /**
     * The **`state`** read-only property of the MIDIPort interface returns the state of the port.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/state)
     */
    val state: MIDIPortDeviceState

    /**
     * The **`type`** read-only property of the MIDIPort interface returns the type of the port, indicating whether this is an input or output MIDI port.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/type)
     */
    val type: MIDIPortType

    /**
     * The **`version`** read-only property of the MIDIPort interface returns the version of the port.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/version)
     */
    val version: String?

    /**
     * The **`close()`** method of the MIDIPort interface makes the access to the MIDI device connected to this `MIDIPort` unavailable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/close)
     */
    @JsName("close")
    fun closeAsync(): Promise<MIDIPort>

    /**
     * The **`open()`** method of the MIDIPort interface makes the MIDI device connected to this `MIDIPort` explicitly available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/open)
     */
    @JsName("open")
    fun openAsync(): Promise<MIDIPort>
}

/**
 * The **`close()`** method of the MIDIPort interface makes the access to the MIDI device connected to this `MIDIPort` unavailable.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/close)
 */
suspend inline fun MIDIPort.close(): MIDIPort {
    return closeAsync().await()
}

/**
 * The **`open()`** method of the MIDIPort interface makes the MIDI device connected to this `MIDIPort` explicitly available.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/open)
 */
suspend inline fun MIDIPort.open(): MIDIPort {
    return openAsync().await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/statechange_event)
 */
inline val <C : MIDIPort> C.stateChangeEvent: EventInstance<MIDIConnectionEvent, C, C>
    get() = EventInstance(this, "statechange")
