// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import web.events.EventType
import web.messaging.MessagePort
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The **`ExtendableMessageEvent`** interface of the Service Worker API represents the event object of a message event fired on a service worker (when a message is received on the ServiceWorkerGlobalScope from another context) — extends the lifetime of such events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent)
 */
open external class ExtendableMessageEvent(
    override val type: EventType<ExtendableMessageEvent>,
    init: ExtendableMessageEventInit = definedExternally,
) : ExtendableEvent {
    /**
     * The **`data`** read-only property of the ExtendableMessageEvent interface returns the event's data. It can be any data type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/data)
     */
    val data: JsAny?

    /**
     * The lastEventID read-only property of the ExtendableMessageEvent interface represents, in server-sent events, the last event ID of the event source. This is an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/lastEventId)
     */
    val lastEventId: String

    /**
     * The **`origin`** read-only property of the ExtendableMessageEvent interface returns the origin of the Client that sent the message.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/origin)
     */
    val origin: String

    /**
     * The **`ports`** read-only property of the ExtendableMessageEvent interface returns the array containing the MessagePort objects representing the ports of the associated message channel (the channel the message is being sent through.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/ports)
     */
    val ports: ReadonlyArray<MessagePort>

    /**
     * The **`source`** read-only property of the ExtendableMessageEvent interface returns a reference to the Client object from which the message was sent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/source)
     */
    val source: JsAny /* Client | ServiceWorker | MessagePort */?

    companion object
}

inline val ExtendableMessageEvent.Companion.MESSAGE: EventType<ExtendableMessageEvent>
    get() = EventType("message")

inline val ExtendableMessageEvent.Companion.MESSAGE_ERROR: EventType<ExtendableMessageEvent>
    get() = EventType("messageerror")
