// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package websockets

import seskar.js.JsValue
import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface CloseEventInit : EventInit {
    var code: Int?
    var reason: String?
    var wasClean: Boolean?
}

/**
 * A CloseEvent is sent to clients using WebSockets when the connection is closed. This is delivered to the listener indicated by the WebSocket object's onclose attribute.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent)
 */
open external class CloseEvent(
    override val type: EventType<CloseEvent>,
    init: CloseEventInit = definedExternally,
) : Event {
    /**
     * Returns the WebSocket connection close code provided by the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/code)
     */
    val code: Int

    /**
     * Returns the WebSocket connection close reason provided by the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/reason)
     */
    val reason: String

    /**
     * Returns true if the connection closed cleanly; false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/wasClean)
     */
    val wasClean: Boolean

    companion object {
        @JsValue("close")
        val CLOSE: EventType<CloseEvent>
    }
}
