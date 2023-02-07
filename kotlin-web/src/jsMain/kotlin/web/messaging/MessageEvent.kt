@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.messaging

import js.core.ReadonlyArray
import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface MessageEventInit<T> : EventInit {
    var data: T
    var lastEventId: String?
    var origin: String?
    var ports: ReadonlyArray<MessagePort>
    var source: MessageEventSource?
}

external class MessageEvent<out T>(
    override val type: EventType<MessageEvent<T>>,
    init: MessageEventInit<T> = definedExternally,
) : Event {
    /** Returns the data of the message. */
    val data: T

    /** Returns the last event ID string, for server-sent events. */
    val lastEventId: String

    /** Returns the origin of the message, for server-sent events and cross-document messaging. */
    val origin: String

    /** Returns the MessagePort array sent with the message, for cross-document messaging and channel messaging. */
    val ports: ReadonlyArray<MessagePort>

    /** Returns the WindowProxy of the source window, for cross-document messaging, and the MessagePort being attached, in the connect event fired at SharedWorkerGlobalScope objects. */
    val source: MessageEventSource?

    companion object
}
