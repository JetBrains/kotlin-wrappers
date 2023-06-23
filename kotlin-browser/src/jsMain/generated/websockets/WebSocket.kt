// Automatically generated - do not modify!

package websockets

import js.buffer.ArrayBufferLike
import js.buffer.ArrayBufferView
import js.core.ReadonlyArray
import web.buffer.Blob
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.messaging.MessageEvent
import web.url.URL

/**
 * Provides the API for creating and managing a WebSocket connection to a server, as well as for sending and receiving data on the connection.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket)
 */
external class WebSocket(
    url: String,
    protocols: String = definedExternally,
) : EventTarget {
    constructor(
        url: URL,
        protocols: String = definedExternally,
    )

    constructor(
        url: String,
        protocols: ReadonlyArray<String>,
    )

    constructor(
        url: URL,
        protocols: ReadonlyArray<String>,
    )

    /**
     * Returns a string that indicates how binary data from the WebSocket object is exposed to scripts:
     *
     * Can be set, to change how binary data is returned. The default is "blob".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/binaryType)
     */
    var binaryType: BinaryType

    /**
     * Returns the number of bytes of application data (UTF-8 text and binary data) that have been queued using send() but not yet been transmitted to the network.
     *
     * If the WebSocket connection is closed, this attribute's value will only increase with each call to the send() method. (The number does not reset to zero once the connection closes.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/bufferedAmount)
     */
    val bufferedAmount: Int

    /**
     * Returns the extensions selected by the server, if any.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/extensions)
     */
    val extensions: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/close_event) */
    var onclose: EventHandler<CloseEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/error_event) */
    var onerror: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/message_event) */
    var onmessage: EventHandler<MessageEvent<*>>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/open_event) */
    var onopen: EventHandler<Event>?

    /**
     * Returns the subprotocol selected by the server, if any. It can be used in conjunction with the array form of the constructor's second argument to perform subprotocol negotiation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/protocol)
     */
    val protocol: String

    /**
     * Returns the state of the WebSocket object's connection. It can have the values described below.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/readyState)
     */
    val readyState: Short

    /**
     * Returns the URL that was used to establish the WebSocket connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/url)
     */
    val url: String

    /**
     * Closes the WebSocket connection, optionally using code as the the WebSocket connection close code and reason as the the WebSocket connection close reason.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/close)
     */
    fun close(
        code: Short = definedExternally,
        reason: String = definedExternally,
    )

    /**
     * Transmits data using the WebSocket connection. data can be a string, a Blob, an ArrayBuffer, or an ArrayBufferView.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/send)
     */
    fun send(data: String)
    fun send(data: ArrayBufferLike)
    fun send(data: Blob)
    fun send(data: ArrayBufferView)
    val CONNECTING: Short
    val OPEN: Short
    val CLOSING: Short
    val CLOSED: Short

    companion object {
        val CONNECTING: Short
        val OPEN: Short
        val CLOSING: Short
        val CLOSED: Short
    }
}
