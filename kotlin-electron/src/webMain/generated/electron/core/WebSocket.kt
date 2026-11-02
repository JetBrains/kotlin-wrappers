// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

open external class WebSocket : web.events.EventTarget {
// Docs: https://electronjs.org/docs/api/web-socket
    /**
     * WebSocket
     */
    constructor (url: String)

// Docs: https://electronjs.org/docs/api/web-socket

    /**
     * WebSocket
     */
    constructor (url: String, protocols: String = definedExternally)

// Docs: https://electronjs.org/docs/api/web-socket

    /**
     * WebSocket
     */
    constructor (url: String, protocols: js.array.ReadonlyArray<String> = definedExternally)

// Docs: https://electronjs.org/docs/api/web-socket

    /**
     * WebSocket
     */
    constructor (url: String, protocols: WebSocketOptions = definedExternally)

    /**
     * Closes the connection. Calling `close()` while still `CONNECTING` aborts the
     * handshake.
     */
    fun close(
        code: Double = definedExternally,
        reason: String = definedExternally,
    )

    /**
     * Enqueues `data` to be transmitted to the server. Throws an `InvalidStateError`
     * `DOMException` if `readyState` is `CONNECTING`.
     */
    fun send(data: String)

    /**
     * Enqueues `data` to be transmitted to the server. Throws an `InvalidStateError`
     * `DOMException` if `readyState` is `CONNECTING`.
     */
    fun send(data: js.buffer.ArrayBufferLike)

    /**
     * Enqueues `data` to be transmitted to the server. Throws an `InvalidStateError`
     * `DOMException` if `readyState` is `CONNECTING`.
     */
    fun send(data: js.buffer.ArrayBufferView<*>)

    /**
     * Enqueues `data` to be transmitted to the server. Throws an `InvalidStateError`
     * `DOMException` if `readyState` is `CONNECTING`.
     */
    fun send(data: web.blob.Blob)

    /**
     * A `string` controlling how incoming binary messages are exposed on the `message`
     * event. Can be `nodebuffer`, `arraybuffer`, or `blob`. The default is
     * `nodebuffer`.
     *
     * `'nodebuffer'` is an Electron extension that delivers binary messages as
     * `Buffer` objects, which is generally the most convenient representation in the
     * main process. Set `binaryType` to `'arraybuffer'` or `'blob'` for behavior
     * identical to the renderer `WebSocket`.
     */
    var binaryType: (WebSocketBinaryType)

    /**
     * An `Integer` representing the number of bytes of application data that have been
     * queued via `send()` but not yet handed off to the network.
     *
     */
    val bufferedAmount: Double

    /**
     * A `string` containing the extensions negotiated by the server (for example
     * `permessage-deflate`).
     *
     */
    val extensions: String

    /**
     * A `Function | null` event handler for the `close` event. Equivalent to calling
     * `addEventListener('close', ...)`.
     */
    var onclose: Function<*>?

    /**
     * A `Function | null` event handler for the `error` event. Equivalent to calling
     * `addEventListener('error', ...)`.
     */
    var onerror: Function<*>?

    /**
     * A `Function | null` event handler for the `message` event. Equivalent to calling
     * `addEventListener('message', ...)`.
     */
    var onmessage: Function<*>?

    /**
     * A `Function | null` event handler for the `open` event. Equivalent to calling
     * `addEventListener('open', ...)`.
     */
    var onopen: Function<*>?

    /**
     * A `string` containing the subprotocol selected by the server. The empty string
     * until the connection is open or if the server did not select a subprotocol.
     *
     */
    val protocol: String

    /**
     * An `Integer` representing the current state of the connection: one of
     * `WebSocket.CONNECTING` (`0`), `WebSocket.OPEN` (`1`), `WebSocket.CLOSING` (`2`),
     * or `WebSocket.CLOSED` (`3`).
     *
     */
    val readyState: Double

    /**
     * A `string` representing the resolved URL of the connection.
     *
     */
    val url: String

    companion object {
        /**
         * An `Integer` constant equal to `3`, the `readyState` value once the connection
         * is closed.
         *
         */
        val CLOSED: Double

        /**
         * An `Integer` constant equal to `2`, the `readyState` value while the closing
         * handshake is in progress.
         *
         */
        val CLOSING: Double

        /**
         * An `Integer` constant equal to `0`, the `readyState` value while the opening
         * handshake is in progress.
         *
         */
        val CONNECTING: Double

        /**
         * An `Integer` constant equal to `1`, the `readyState` value once the connection
         * is established.
         *
         */
        val OPEN: Double
    }
}
