// Automatically generated - do not modify!

package web.midi

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

sealed external class MIDIPort :
    EventTarget {
    val connection: MIDIPortConnectionState
    val id: String
    val manufacturer: String?
    val name: String?
    var onstatechange: EventHandler<Event>?
    val state: MIDIPortDeviceState
    val type: MIDIPortType
    val version: String?
    fun close(): Promise<MIDIPort>
    fun open(): Promise<MIDIPort>
}
