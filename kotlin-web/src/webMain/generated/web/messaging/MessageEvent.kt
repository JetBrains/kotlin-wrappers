// Automatically generated - do not modify!

package web.messaging

import js.array.ReadonlyArray
import web.events.Event
import web.events.EventType

/**
 * The **`MessageEvent`** interface represents a message received by a target object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent)
 */
open external class MessageEvent<out D : JsAny?>(
    override val type: EventType<MessageEvent<D>>,
    init: MessageEventInit<D> = definedExternally,
) : Event {
    /**
     * The **`data`** read-only property of the MessageEvent interface represents the data sent by the message emitter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/data)
     */
    open val data: D

    /**
     * The **`lastEventId`** read-only property of the MessageEvent interface is a string representing a unique ID for the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/lastEventId)
     */
    open val lastEventId: String

    /**
     * The **`origin`** read-only property of the MessageEvent interface is a string representing the origin of the message emitter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/origin)
     */
    open val origin: String

    /**
     * The **`ports`** read-only property of the MessageEvent interface is an array of MessagePort objects containing all MessagePort objects sent with the message, in order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/ports)
     */
    open val ports: ReadonlyArray<MessagePort>

    /**
     * The **`source`** read-only property of the MessageEvent interface is a MessageEventSource (which can be a WindowProxy, MessagePort, or ServiceWorker object) representing the message emitter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/source)
     */
    open val source: MessageEventSource?

    companion object
}

inline val MessageEvent.Companion.CONNECT: EventType<MessageEvent<*>>
    get() = EventType("connect")

inline val MessageEvent.Companion.MESSAGE: EventType<MessageEvent<*>>
    get() = EventType("message")

inline val MessageEvent.Companion.MESSAGE_ERROR: EventType<MessageEvent<*>>
    get() = EventType("messageerror")
