// Automatically generated - do not modify!

package web.sockets

import js.array.ReadonlyArray
import js.buffer.ArrayBufferLike
import js.buffer.ArrayBufferView
import js.core.JsAny
import js.core.JsString
import js.core.UInt53
import web.blob.Blob
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.messaging.MessageEvent
import web.url.URL
import kotlin.js.definedExternally

/**
 * The `WebSocket` object provides the API for creating and managing a WebSocket connection to a server, as well as for sending and receiving data on the connection.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket)
 */
open external class WebSocket(
    /**
     * The **`WebSocket.url`** read-only property returns the absolute URL of the WebSocket as resolved by the constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/url)
     */
    val url: String,
    /**
     * The **`WebSocket.protocol`** read-only property returns the name of the sub-protocol the server selected; this will be one of the strings specified in the `protocols` parameter when creating the WebSocket object, or the empty string if no connection is established.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/protocol)
     */
    val protocol: String = definedExternally,
) : EventTarget {
    constructor(
        url: URL,
        protocol: String = definedExternally,
    )

    constructor(
        url: String,
        protocols: ReadonlyArray<JsString>,
    )

    constructor(
        url: URL,
        protocols: ReadonlyArray<JsString>,
    )

    /**
     * The **`WebSocket.binaryType`** property controls the type of binary data being received over the WebSocket connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/binaryType)
     */
    var binaryType: BinaryType

    /**
     * The **`WebSocket.bufferedAmount`** read-only property returns the number of bytes of data that have been queued using calls to `send()` but not yet transmitted to the network.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/bufferedAmount)
     */
    val bufferedAmount: UInt53

    /**
     * The **`WebSocket.extensions`** read-only property returns the extensions selected by the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/extensions)
     */
    val extensions: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/close_event)
     */
    var onclose: EventHandler<CloseEvent, WebSocket, WebSocket>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/error_event)
     */
    var onerror: EventHandler<Event, WebSocket, WebSocket>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/message_event)
     */
    var onmessage: EventHandler<MessageEvent<*>, WebSocket, WebSocket>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/open_event)
     */
    var onopen: EventHandler<Event, WebSocket, WebSocket>?

    /**
     * The **`WebSocket.readyState`** read-only property returns the current state of the WebSocket connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/readyState)
     */
    val readyState: ReadyState

    /**
     * The **`WebSocket.close()`** method closes the WebSocket connection or connection attempt, if any.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/close)
     */
    fun close(
        code: Short = definedExternally,
        reason: String = definedExternally,
    )

    /**
     * The **`WebSocket.send()`** method enqueues the specified data to be transmitted to the server over the WebSocket connection, increasing the value of `bufferedAmount` by the number of bytes needed to contain the data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/send)
     */
    fun send(data: String)
    fun send(data: ArrayBufferLike)
    fun send(data: Blob)
    fun send(data: ArrayBufferView<*>)
    val CONNECTING: ReadyState
    val OPEN: ReadyState
    val CLOSING: ReadyState
    val CLOSED: ReadyState

    companion object {
        val CONNECTING: ReadyState
        val OPEN: ReadyState
        val CLOSING: ReadyState
        val CLOSED: ReadyState
    }

    sealed interface ReadyState
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/close_event)
 */
inline val <C : WebSocket> C.closeEvent: EventInstance<CloseEvent, C, C>
    get() = EventInstance(this, "close")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/error_event)
 */
inline val <C : WebSocket> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/message_event)
 */
inline val <C : WebSocket> C.messageEvent: EventInstance<MessageEvent<JsAny?>, C, C>
    get() = EventInstance(this, "message")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/open_event)
 */
inline val <C : WebSocket> C.openEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "open")
