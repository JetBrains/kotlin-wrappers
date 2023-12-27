// Generated by Karakum - do not modify it manually!

@file:JsModule("node:net")

package node.net

import js.typedarrays.Uint8Array

/**
 * This class is an abstraction of a TCP socket or a streaming `IPC` endpoint
 * (uses named pipes on Windows, and Unix domain sockets otherwise). It is also
 * an `EventEmitter`.
 *
 * A `net.Socket` can be created by the user and used directly to interact with
 * a server. For example, it is returned by {@link createConnection},
 * so the user can use it to talk to the server.
 *
 * It can also be created by Node.js and passed to the user when a connection
 * is received. For example, it is passed to the listeners of a `'connection'` event emitted on a {@link Server}, so the user can use
 * it to interact with the client.
 * @since v0.3.4
 */

open external class Socket : node.stream.Duplex {
    constructor (options: SocketConstructorOpts = definedExternally)

    /**
     * Sends data on the socket. The second parameter specifies the encoding in the
     * case of a string. It defaults to UTF8 encoding.
     *
     * Returns `true` if the entire data was flushed successfully to the kernel
     * buffer. Returns `false` if all or part of the data was queued in user memory.`'drain'` will be emitted when the buffer is again free.
     *
     * The optional `callback` parameter will be executed when the data is finally
     * written out, which may not be immediately.
     *
     * See `Writable` stream `write()` method for more
     * information.
     * @since v0.1.90
     * @param [encoding='utf8'] Only used when data is `string`.
     */
    override fun write(
        buffer: Uint8Array,
        cb: (err: Throwable /* JsError */? /* use undefined for default */) -> Unit,
    ): Boolean

    override fun write(
        buffer: String,
        cb: (err: Throwable /* JsError */? /* use undefined for default */) -> Unit,
    ): Boolean

    fun write(
        str: Uint8Array,
        encoding: node.buffer.BufferEncoding = definedExternally,
        cb: (err: Throwable /* JsError */? /* use undefined for default */) -> Unit = definedExternally,
    ): Boolean

    override fun write(
        str: String,
        encoding: node.buffer.BufferEncoding,
        cb: (err: Throwable /* JsError */? /* use undefined for default */) -> Unit,
    ): Boolean

    /**
     * Initiate a connection on a given socket.
     *
     * Possible signatures:
     *
     * * `socket.connect(options[, connectListener])`
     * * `socket.connect(path[, connectListener])` for `IPC` connections.
     * * `socket.connect(port[, host][, connectListener])` for TCP connections.
     * * Returns: `net.Socket` The socket itself.
     *
     * This function is asynchronous. When the connection is established, the `'connect'` event will be emitted. If there is a problem connecting,
     * instead of a `'connect'` event, an `'error'` event will be emitted with
     * the error passed to the `'error'` listener.
     * The last parameter `connectListener`, if supplied, will be added as a listener
     * for the `'connect'` event **once**.
     *
     * This function should only be used for reconnecting a socket after`'close'` has been emitted or otherwise it may lead to undefined
     * behavior.
     */
    fun connect(options: SocketConnectOpts, connectionListener: () -> Unit = definedExternally): Unit /* this */
    fun connect(port: Number, host: String, connectionListener: () -> Unit = definedExternally): Unit /* this */
    fun connect(port: Number, connectionListener: () -> Unit = definedExternally): Unit /* this */
    fun connect(path: String, connectionListener: () -> Unit = definedExternally): Unit /* this */

    /**
     * Set the encoding for the socket as a `Readable Stream`. See `readable.setEncoding()` for more information.
     * @since v0.1.90
     * @return The socket itself.
     */
    override fun setEncoding(encoding: node.buffer.BufferEncoding): Unit /* this */

    /**
     * Pauses the reading of data. That is, `'data'` events will not be emitted.
     * Useful to throttle back an upload.
     * @return The socket itself.
     */
    override fun pause(): Unit /* this */

    /**
     * Close the TCP connection by sending an RST packet and destroy the stream.
     * If this TCP socket is in connecting status, it will send an RST packet
     * and destroy this TCP socket once it is connected. Otherwise, it will call
     * `socket.destroy` with an `ERR_SOCKET_CLOSED` Error. If this is not a TCP socket
     * (for example, a pipe), calling this method will immediately throw
     * an `ERR_INVALID_HANDLE_TYPE` Error.
     * @since v18.3.0
     * @return The socket itself.
     */
    fun resetAndDestroy(): Unit /* this */

    /**
     * Resumes reading after a call to `socket.pause()`.
     * @return The socket itself.
     */
    override fun resume(): Unit /* this */

    /**
     * Sets the socket to timeout after `timeout` milliseconds of inactivity on
     * the socket. By default `net.Socket` do not have a timeout.
     *
     * When an idle timeout is triggered the socket will receive a `'timeout'` event but the connection will not be severed. The user must manually call `socket.end()` or `socket.destroy()` to
     * end the connection.
     *
     * ```js
     * socket.setTimeout(3000);
     * socket.on('timeout', () => {
     *   console.log('socket timeout');
     *   socket.end();
     * });
     * ```
     *
     * If `timeout` is 0, then the existing idle timeout is disabled.
     *
     * The optional `callback` parameter will be added as a one-time listener for the `'timeout'` event.
     * @since v0.1.90
     * @return The socket itself.
     */
    fun setTimeout(timeout: Number, callback: () -> Unit = definedExternally): Unit /* this */

    /**
     * Enable/disable the use of Nagle's algorithm.
     *
     * When a TCP connection is created, it will have Nagle's algorithm enabled.
     *
     * Nagle's algorithm delays data before it is sent via the network. It attempts
     * to optimize throughput at the expense of latency.
     *
     * Passing `true` for `noDelay` or not passing an argument will disable Nagle's
     * algorithm for the socket. Passing `false` for `noDelay` will enable Nagle's
     * algorithm.
     * @since v0.1.90
     * @param [noDelay=true]
     * @return The socket itself.
     */
    fun setNoDelay(noDelay: Boolean = definedExternally): Unit /* this */

    /**
     * Enable/disable keep-alive functionality, and optionally set the initial
     * delay before the first keepalive probe is sent on an idle socket.
     *
     * Set `initialDelay` (in milliseconds) to set the delay between the last
     * data packet received and the first keepalive probe. Setting `0` for`initialDelay` will leave the value unchanged from the default
     * (or previous) setting.
     *
     * Enabling the keep-alive functionality will set the following socket options:
     *
     * * `SO_KEEPALIVE=1`
     * * `TCP_KEEPIDLE=initialDelay`
     * * `TCP_KEEPCNT=10`
     * * `TCP_KEEPINTVL=1`
     * @since v0.1.92
     * @param [enable=false]
     * @param [initialDelay=0]
     * @return The socket itself.
     */
    fun setKeepAlive(enable: Boolean = definedExternally, initialDelay: Number = definedExternally): Unit /* this */

    /**
     * Returns the bound `address`, the address `family` name and `port` of the
     * socket as reported by the operating system:`{ port: 12346, family: 'IPv4', address: '127.0.0.1' }`
     * @since v0.1.90
     */
    fun address(): Any /* AddressInfo | {} */

    /**
     * Calling `unref()` on a socket will allow the program to exit if this is the only
     * active socket in the event system. If the socket is already `unref`ed calling`unref()` again will have no effect.
     * @since v0.9.1
     * @return The socket itself.
     */
    fun unref(): Unit /* this */

    /**
     * Opposite of `unref()`, calling `ref()` on a previously `unref`ed socket will _not_ let the program exit if it's the only socket left (the default behavior).
     * If the socket is `ref`ed calling `ref` again will have no effect.
     * @since v0.9.1
     * @return The socket itself.
     */
    fun ref(): Unit /* this */

    /**
     * This property shows the number of characters buffered for writing. The buffer
     * may contain strings whose length after encoding is not yet known. So this number
     * is only an approximation of the number of bytes in the buffer.
     *
     * `net.Socket` has the property that `socket.write()` always works. This is to
     * help users get up and running quickly. The computer cannot always keep up
     * with the amount of data that is written to a socket. The network connection
     * simply might be too slow. Node.js will internally queue up the data written to a
     * socket and send it out over the wire when it is possible.
     *
     * The consequence of this internal buffering is that memory may grow.
     * Users who experience large or growing `bufferSize` should attempt to
     * "throttle" the data flows in their program with `socket.pause()` and `socket.resume()`.
     * @since v0.3.8
     * @deprecated Since v14.6.0 - Use `writableLength` instead.
     */
    val bufferSize: Double

    /**
     * The amount of received bytes.
     * @since v0.5.3
     */
    val bytesRead: Double

    /**
     * The amount of bytes sent.
     * @since v0.5.3
     */
    val bytesWritten: Double

    /**
     * If `true`,`socket.connect(options[, connectListener])` was
     * called and has not yet finished. It will stay `true` until the socket becomes
     * connected, then it is set to `false` and the `'connect'` event is emitted. Note
     * that the `socket.connect(options[, connectListener])` callback is a listener for the `'connect'` event.
     * @since v6.1.0
     */
    val connecting: Boolean

    /**
     * This is `true` if the socket is not connected yet, either because `.connect()`
     * has not yet been called or because it is still in the process of connecting (see `socket.connecting`).
     * @since v10.16.0
     */
    val pending: Boolean

    /**
     * See `writable.destroyed` for further details.
     */
    @JsName("destroyed")
    val netSocketDestroyed: Boolean

    /**
     * The string representation of the local IP address the remote client is
     * connecting on. For example, in a server listening on `'0.0.0.0'`, if a client
     * connects on `'192.168.1.1'`, the value of `socket.localAddress` would be`'192.168.1.1'`.
     * @since v0.9.6
     */
    val localAddress: String?

    /**
     * The numeric representation of the local port. For example, `80` or `21`.
     * @since v0.9.6
     */
    val localPort: Double?

    /**
     * The string representation of the local IP family. `'IPv4'` or `'IPv6'`.
     * @since v18.8.0
     */
    val localFamily: String?

    /**
     * This property represents the state of the connection as a string.
     * @see {https://nodejs.org/api/net.html#socketreadystate}
     * @since v0.5.0
     */
    val readyState: SocketReadyState

    /**
     * The string representation of the remote IP address. For example,`'74.125.127.100'` or `'2001:4860:a005::68'`. Value may be `undefined` if
     * the socket is destroyed (for example, if the client disconnected).
     * @since v0.5.10
     */
    val remoteAddress: String?

    /**
     * The string representation of the remote IP family. `'IPv4'` or `'IPv6'`.
     * @since v0.11.14
     */
    val remoteFamily: String?

    /**
     * The numeric representation of the remote port. For example, `80` or `21`.
     * @since v0.5.10
     */
    val remotePort: Double?

    /**
     * The socket timeout in milliseconds as set by socket.setTimeout(). It is undefined if a timeout has not been set.
     * @since v10.7.0
     */
    val timeout: Double?

    /**
     * Half-closes the socket. i.e., it sends a FIN packet. It is possible the
     * server will still send some data.
     *
     * See `writable.end()` for further details.
     * @since v0.1.90
     * @param [encoding='utf8'] Only used when data is `string`.
     * @param callback Optional callback for when the socket is finished.
     * @return The socket itself.
     */
    override fun end(cb: () -> Unit): Unit /* this */
    override fun end(data: Uint8Array, cb: () -> Unit): Unit /* this */

    override fun end(data: String, cb: () -> Unit): Unit /* this */
    fun end(
        str: Uint8Array,
        encoding: node.buffer.BufferEncoding = definedExternally,
        cb: () -> Unit = definedExternally,
    ): Unit /* this */

    override fun end(str: String, encoding: node.buffer.BufferEncoding, cb: () -> Unit): Unit /* this */

    /**
     * events.EventEmitter
     *   1. close
     *   2. connect
     *   3. data
     *   4. drain
     *   5. end
     *   6. error
     *   7. lookup
     *   8. ready
     *   9. timeout
     */
    override fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun addListener(event: SocketEvent.CLOSE, listener: (hadError: Boolean) -> Unit): Unit /* this */
    fun addListener(event: SocketEvent.CONNECT, listener: () -> Unit): Unit /* this */
    fun addListener(event: SocketEvent.DATA, listener: (data: node.buffer.Buffer) -> Unit): Unit /* this */
    fun addListener(event: SocketEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun addListener(event: SocketEvent.END, listener: () -> Unit): Unit /* this */
    fun addListener(event: SocketEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun addListener(
        event: SocketEvent.LOOKUP,
        listener: (err: Throwable /* JsError */, address: String, family: Any /* string | number */, host: String) -> Unit,
    ): Unit /* this */

    fun addListener(event: SocketEvent.READY, listener: () -> Unit): Unit /* this */
    fun addListener(event: SocketEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    override fun emit(event: String, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Boolean

    override fun emit(event: js.core.Symbol, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Boolean
    fun emit(event: SocketEvent.CLOSE, hadError: Boolean): Boolean
    fun emit(event: SocketEvent.CONNECT): Boolean
    fun emit(event: SocketEvent.DATA, data: node.buffer.Buffer): Boolean
    fun emit(event: SocketEvent.DRAIN): Boolean
    fun emit(event: SocketEvent.END): Boolean
    fun emit(event: SocketEvent.ERROR, err: Throwable /* JsError */): Boolean
    fun emit(
        event: SocketEvent.LOOKUP,
        err: Throwable, /* JsError */
        address: String,
        family: String,
        host: String,
    ): Boolean

    fun emit(
        event: SocketEvent.LOOKUP,
        err: Throwable, /* JsError */
        address: String,
        family: Double,
        host: String,
    ): Boolean

    fun emit(event: SocketEvent.READY): Boolean
    fun emit(event: SocketEvent.TIMEOUT): Boolean
    override fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun on(event: SocketEvent.CLOSE, listener: (hadError: Boolean) -> Unit): Unit /* this */
    fun on(event: SocketEvent.CONNECT, listener: () -> Unit): Unit /* this */
    fun on(event: SocketEvent.DATA, listener: (data: node.buffer.Buffer) -> Unit): Unit /* this */
    fun on(event: SocketEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun on(event: SocketEvent.END, listener: () -> Unit): Unit /* this */
    fun on(event: SocketEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun on(
        event: SocketEvent.LOOKUP,
        listener: (err: Throwable /* JsError */, address: String, family: Any /* string | number */, host: String) -> Unit,
    ): Unit /* this */

    fun on(event: SocketEvent.READY, listener: () -> Unit): Unit /* this */
    fun on(event: SocketEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    override fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun once(event: SocketEvent.CLOSE, listener: (hadError: Boolean) -> Unit): Unit /* this */
    fun once(event: SocketEvent.CONNECT, listener: () -> Unit): Unit /* this */
    fun once(event: SocketEvent.DATA, listener: (data: node.buffer.Buffer) -> Unit): Unit /* this */
    fun once(event: SocketEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun once(event: SocketEvent.END, listener: () -> Unit): Unit /* this */
    fun once(event: SocketEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun once(
        event: SocketEvent.LOOKUP,
        listener: (err: Throwable /* JsError */, address: String, family: Any /* string | number */, host: String) -> Unit,
    ): Unit /* this */

    fun once(event: SocketEvent.READY, listener: () -> Unit): Unit /* this */
    fun once(event: SocketEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    override fun prependListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    fun prependListener(event: SocketEvent.CLOSE, listener: (hadError: Boolean) -> Unit): Unit /* this */
    fun prependListener(event: SocketEvent.CONNECT, listener: () -> Unit): Unit /* this */
    fun prependListener(event: SocketEvent.DATA, listener: (data: node.buffer.Buffer) -> Unit): Unit /* this */
    fun prependListener(event: SocketEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun prependListener(event: SocketEvent.END, listener: () -> Unit): Unit /* this */
    fun prependListener(event: SocketEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun prependListener(
        event: SocketEvent.LOOKUP,
        listener: (err: Throwable /* JsError */, address: String, family: Any /* string | number */, host: String) -> Unit,
    ): Unit /* this */

    fun prependListener(event: SocketEvent.READY, listener: () -> Unit): Unit /* this */
    fun prependListener(event: SocketEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    override fun prependOnceListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    fun prependOnceListener(event: SocketEvent.CLOSE, listener: (hadError: Boolean) -> Unit): Unit /* this */
    fun prependOnceListener(event: SocketEvent.CONNECT, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: SocketEvent.DATA, listener: (data: node.buffer.Buffer) -> Unit): Unit /* this */
    fun prependOnceListener(event: SocketEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: SocketEvent.END, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: SocketEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun prependOnceListener(
        event: SocketEvent.LOOKUP,
        listener: (err: Throwable /* JsError */, address: String, family: Any /* string | number */, host: String) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: SocketEvent.READY, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: SocketEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
}
