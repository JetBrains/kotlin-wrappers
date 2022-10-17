package websockets

import kotlinx.js.ArrayBuffer
import kotlinx.js.ArrayBufferView
import kotlinx.js.ReadonlyArray
import web.buffer.Blob
import web.events.Event
import web.events.EventTarget
import web.messaging.MessageEvent
import web.url.URL

external class WebSocket : EventTarget {
    constructor(
        url: String,
        protocol: String = definedExternally,
    )

    constructor(
        url: String,
        protocols: ReadonlyArray<String>,
    )

    constructor(
        url: URL,
        protocol: String = definedExternally,
    )

    constructor(
        url: URL,
        protocols: ReadonlyArray<String>,
    )

    /**
     * Returns a string that indicates how binary data from the WebSocket object is exposed to scripts:
     *
     * Can be set, to change how binary data is returned. The default is "blob".
     */
    var binaryType: BinaryType

    /**
     * Returns the number of bytes of application data (UTF-8 text and binary data) that have been queued using send() but not yet been transmitted to the network.
     *
     * If the WebSocket connection is closed, this attribute's value will only increase with each call to the send() method. (The number does not reset to zero once the connection closes.)
     */
    val bufferedAmount: Number

    /** Returns the extensions selected by the server, if any. */
    val extensions: String
    var onclose: ((event: CloseEvent) -> Unit)?
    var onerror: ((event: Event) -> Unit)?
    var onmessage: ((event: MessageEvent) -> Unit)?
    var onopen: ((event: Event) -> Unit)?

    /** Returns the subprotocol selected by the server, if any. It can be used in conjunction with the array form of the constructor's second argument to perform subprotocol negotiation. */
    val protocol: String

    /** Returns the state of the WebSocket object's connection. It can have the values described below. */
    val readyState: ReadyState

    /** Returns the URL that was used to establish the WebSocket connection. */
    val url: String

    /** Closes the WebSocket connection, optionally using code as the the WebSocket connection close code and reason as the the WebSocket connection close reason. */
    fun close(
        code: Short = definedExternally,
        reason: String = definedExternally,
    )

    /** Transmits data using the WebSocket connection. data can be a string, a Blob, an ArrayBuffer, or an ArrayBufferView. */
    fun send(data: String)
    fun send(data: Blob)
    fun send(data: ArrayBuffer)
    fun send(data: ArrayBufferView)

    sealed interface ReadyState

    companion object {
        val CLOSED: ReadyState
        val CLOSING: ReadyState
        val CONNECTING: ReadyState
        val OPEN: ReadyState
    }
}
