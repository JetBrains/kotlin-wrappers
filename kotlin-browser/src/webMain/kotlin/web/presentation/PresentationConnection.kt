package web.presentation

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView
import web.blob.Blob
import web.buffer.BinaryType
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.experimental.ExperimentalWebApi
import web.messaging.MessageEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection)
 */
@ExperimentalWebApi
open external class PresentationConnection
private constructor() :
    EventTarget {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/id)
     */
    open val id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/url)
     */
    open val url: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/state)
     */
    open val state: PresentationConnectionState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/close)
     */
    open fun close()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/terminate)
     */
    open fun terminate()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/connect_event)
     */
    open var onconnect: EventHandler<Event, PresentationConnection, PresentationConnection>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/close_event)
     */
    open var onclose: EventHandler<PresentationConnectionCloseEvent, PresentationConnection, PresentationConnection>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/terminate_event)
     */
    open var onterminate: EventHandler<Event, PresentationConnection, PresentationConnection>

    // Communication

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/binaryType)
     */
    open var binaryType: BinaryType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/message_event)
     */
    open var onmessage: EventHandler<MessageEvent<JsAny>, PresentationConnection, PresentationConnection>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/send)
     */
    open fun send(message: String)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/send)
     */
    open fun send(data: Blob)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/send)
     */
    open fun send(data: ArrayBuffer)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/send)
     */
    open fun send(data: ArrayBufferView<*>)
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/connect_event)
 */
@ExperimentalWebApi
inline val <C : PresentationConnection> C.connectEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "connect")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/close_event)
 */
@ExperimentalWebApi
inline val <C : PresentationConnection> C.closeEvent: EventInstance<PresentationConnectionCloseEvent, C, C>
    get() = EventInstance(this, "close")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/terminate_event)
 */
@ExperimentalWebApi
inline val <C : PresentationConnection> C.terminateEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "terminate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnection/message_event)
 */
@ExperimentalWebApi
inline val <C : PresentationConnection> C.messageEvent: EventInstance<MessageEvent<JsAny>, C, C>
    get() = EventInstance(this, "message")

