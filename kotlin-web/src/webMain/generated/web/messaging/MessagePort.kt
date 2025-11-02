// Automatically generated - do not modify!

package web.messaging

import js.array.ReadonlyArray
import js.closeable.JsCloseable
import js.serialization.Transferable
import web.events.Event
import web.events.EventInstance
import web.events.EventTarget
import web.serialization.StructuredSerializeOptions
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The **`MessagePort`** interface of the Channel Messaging API represents one of the two ports of a MessageChannel, allowing messages to be sent from one port and listening out for them arriving at the other.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort)
 */
open external class MessagePort
private constructor() :
    EventTarget,
    MessageEventTarget,
    MessageEventSource,
    Transferable,
    JsCloseable {
    /**
     * The **`close()`** method of the MessagePort interface disconnects the port, so it is no longer active. This stops the flow of messages to that port.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/close)
     */
    override fun close()

    /**
     * The **`postMessage()`** method of the MessagePort interface sends a message from the port, and optionally, transfers ownership of objects to other browsing contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/postMessage)
     */
    fun postMessage(
        message: JsAny?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: String,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: JsAny?,
        options: StructuredSerializeOptions = definedExternally,
    )

    fun postMessage(
        message: String,
        options: StructuredSerializeOptions = definedExternally,
    )

    /**
     * The **`start()`** method of the MessagePort interface starts the sending of messages queued on the port. This method is only needed when using EventTarget.addEventListener; it is implied when using onmessage.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/start)
     */
    fun start()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/close_event)
 */
inline val <C : MessagePort> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "close")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/message_event)
 */
inline val <C : MessagePort> C.messageEvent: EventInstance<MessageEvent<JsAny?>, C, C>
    get() = EventInstance(this, "message")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/messageerror_event)
 */
inline val <C : MessagePort> C.messageErrorEvent: EventInstance<MessageEvent<JsAny?>, C, C>
    get() = EventInstance(this, "messageerror")
