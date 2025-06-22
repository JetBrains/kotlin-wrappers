// Automatically generated - do not modify!

package web.messaging

import js.array.ReadonlyArray
import js.core.JsAny
import js.serialization.Transferable
import web.events.Event
import web.events.EventInstance
import web.events.EventTarget
import web.serialization.StructuredSerializeOptions
import kotlin.js.definedExternally

/**
 * The **`MessagePort`** interface of the Channel Messaging API represents one of the two ports of a MessageChannel, allowing messages to be sent from one port and listening out for them arriving at the other.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort)
 */
external class MessagePort
private constructor() :
    EventTarget,
    MessageEventTarget,
    MessageEventSource,
    Transferable {
    /**
     * The **`close()`** method of the MessagePort interface disconnects the port, so it is no longer active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/close)
     */
    fun close()

    /**
     * The **`postMessage()`** method of the transfers ownership of objects to other browsing contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/postMessage)
     */
    fun postMessage(
        message: JsAny?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: JsAny?,
        options: StructuredSerializeOptions = definedExternally,
    )

    /**
     * The **`start()`** method of the MessagePort interface starts the sending of messages queued on the port.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/start)
     */
    fun start()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/close_event)
 */
inline val MessagePort.closeEvent: EventInstance<Event, MessagePort, MessagePort>
    get() = EventInstance(this, "close")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/message_event)
 */
inline val MessagePort.messageEvent: EventInstance<MessageEvent<JsAny?>, MessagePort, MessagePort>
    get() = EventInstance(this, "message")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/messageerror_event)
 */
inline val MessagePort.messageErrorEvent: EventInstance<MessageEvent<JsAny?>, MessagePort, MessagePort>
    get() = EventInstance(this, "messageerror")
