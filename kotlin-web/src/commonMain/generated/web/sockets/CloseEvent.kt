// Automatically generated - do not modify!

package web.sockets

import js.reflect.unsafeCast
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * A `CloseEvent` is sent to clients using WebSockets when the connection is closed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent)
 */
open external class CloseEvent(
    override val type: EventType<CloseEvent>,
    init: CloseEventInit = definedExternally,
) : Event {
    /**
     * The **`code`** read-only property of the CloseEvent interface returns a WebSocket connection close code indicating the reason the connection was closed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/code)
     */
    val code: Short

    /**
     * The **`reason`** read-only property of the CloseEvent interface returns the WebSocket connection close reason the server gave for closing the connection; that is, a concise human-readable prose explanation for the closure.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/reason)
     */
    val reason: String

    /**
     * The **`wasClean`** read-only property of the CloseEvent interface returns `true` if the connection closed cleanly.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/wasClean)
     */
    val wasClean: Boolean

    companion object
}

inline fun CloseEvent.asInit(): CloseEventInit =
    unsafeCast(this)

inline val CloseEvent.Companion.CLOSE: EventType<CloseEvent>
    get() = EventType("close")
