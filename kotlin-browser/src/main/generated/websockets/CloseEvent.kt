// Automatically generated - do not modify!

package websockets

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface CloseEventInit : EventInit {
    var code: Int?
    var reason: String?
    var wasClean: Boolean?
}

open external class CloseEvent(
    type: EventType<CloseEvent>,
    init: CloseEventInit = definedExternally,
) : Event {
    /** Returns the WebSocket connection close code provided by the server. */
    val code: Int

    /** Returns the WebSocket connection close reason provided by the server. */
    val reason: String

    /** Returns true if the connection closed cleanly; false otherwise. */
    val wasClean: Boolean

    companion object
}
