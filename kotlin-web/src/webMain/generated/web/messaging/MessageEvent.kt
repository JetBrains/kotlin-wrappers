// Automatically generated - do not modify!

package web.messaging

import js.array.ReadonlyArray
import js.core.JsAny
import js.reflect.unsafeCast
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

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
    val data: D

    /**
     * The **`lastEventId`** read-only property of the MessageEvent interface is a string representing a unique ID for the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/lastEventId)
     */
    val lastEventId: String

    /**
     * The **`origin`** read-only property of the MessageEvent interface is a string representing the origin of the message emitter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/origin)
     */
    val origin: String

    /**
     * The **`ports`** read-only property of the MessageEvent interface is an array of MessagePort objects containing all MessagePort objects sent with the message, in order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/ports)
     */
    val ports: ReadonlyArray<MessagePort>

    /**
     * The **`source`** read-only property of the MessageEvent interface is a `MessageEventSource` (which can be a WindowProxy, MessagePort, or ServiceWorker object) representing the message emitter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/source)
     */
    val source: MessageEventSource?

    companion object
}

inline fun <D : JsAny?> MessageEvent<D>.asInit(): MessageEventInit<D> =
    unsafeCast(this)

inline val MessageEvent.Companion.CONNECT: EventType<MessageEvent<*>>
    get() = EventType("connect")

inline val MessageEvent.Companion.MESSAGE: EventType<MessageEvent<*>>
    get() = EventType("message")

inline val MessageEvent.Companion.MESSAGE_ERROR: EventType<MessageEvent<*>>
    get() = EventType("messageerror")
