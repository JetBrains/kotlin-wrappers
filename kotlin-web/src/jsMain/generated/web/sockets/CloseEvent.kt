// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.sockets

import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * A CloseEvent is sent to clients using WebSockets when the connection is closed. This is delivered to the listener indicated by the WebSocket object's onclose attribute.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent)
 */
open external class CloseEvent<out C : EventTarget?>(
    override val type: EventType<CloseEvent<EventTarget>>,
    init: CloseEventInit = definedExternally,
) : Event<C>,
    CloseEventInit {
    /**
     * Returns the WebSocket connection close code provided by the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/code)
     */
    override val code: Short

    /**
     * Returns the WebSocket connection close reason provided by the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/reason)
     */
    override val reason: String

    /**
     * Returns true if the connection closed cleanly; false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/wasClean)
     */
    override val wasClean: Boolean

    companion object : CloseEventTypes
}
