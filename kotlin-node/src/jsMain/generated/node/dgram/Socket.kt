@file:JsModule("node:dgram")

package node.dgram

import js.core.ReadonlyArray
import js.typedarrays.Uint8Array
import node.events.EventEmitter
import node.net.AddressInfo

/**
 * Encapsulates the datagram functionality.
 *
 * New instances of `dgram.Socket` are created using {@link createSocket}.
 * The `new` keyword is not to be used to create `dgram.Socket` instances.
 * @since v0.1.99
 */

external class Socket : EventEmitter {
    /**
     * Tells the kernel to join a multicast group at the given `multicastAddress` and`multicastInterface` using the `IP_ADD_MEMBERSHIP` socket option. If the`multicastInterface` argument is not
     * specified, the operating system will choose
     * one interface and will add membership to it. To add membership to every
     * available interface, call `addMembership` multiple times, once per interface.
     *
     * When called on an unbound socket, this method will implicitly bind to a random
     * port, listening on all interfaces.
     *
     * When sharing a UDP socket across multiple `cluster` workers, the`socket.addMembership()` function must be called only once or an`EADDRINUSE` error will occur:
     *
     * ```js
     * import cluster from 'cluster';
     * import dgram from 'dgram';
     *
     * if (cluster.isPrimary) {
     *   cluster.fork(); // Works ok.
     *   cluster.fork(); // Fails with EADDRINUSE.
     * } else {
     *   const s = dgram.createSocket('udp4');
     *   s.bind(1234, () => {
     *     s.addMembership('224.0.0.114');
     *   });
     * }
     * ```
     * @since v0.6.9
     */
    fun addMembership(multicastAddress: String, multicastInterface: String = definedExternally): Unit

    /**
     * Returns an object containing the address information for a socket.
     * For UDP sockets, this object will contain `address`, `family` and `port`properties.
     *
     * This method throws `EBADF` if called on an unbound socket.
     * @since v0.1.99
     */
    fun address(): AddressInfo

    /**
     * For UDP sockets, causes the `dgram.Socket` to listen for datagram
     * messages on a named `port` and optional `address`. If `port` is not
     * specified or is `0`, the operating system will attempt to bind to a
     * random port. If `address` is not specified, the operating system will
     * attempt to listen on all addresses. Once binding is complete, a`'listening'` event is emitted and the optional `callback` function is
     * called.
     *
     * Specifying both a `'listening'` event listener and passing a`callback` to the `socket.bind()` method is not harmful but not very
     * useful.
     *
     * A bound datagram socket keeps the Node.js process running to receive
     * datagram messages.
     *
     * If binding fails, an `'error'` event is generated. In rare case (e.g.
     * attempting to bind with a closed socket), an `Error` may be thrown.
     *
     * Example of a UDP server listening on port 41234:
     *
     * ```js
     * import dgram from 'dgram';
     *
     * const server = dgram.createSocket('udp4');
     *
     * server.on('error', (err) => {
     *   console.log(`server error:\n${err.stack}`);
     *   server.close();
     * });
     *
     * server.on('message', (msg, rinfo) => {
     *   console.log(`server got: ${msg} from ${rinfo.address}:${rinfo.port}`);
     * });
     *
     * server.on('listening', () => {
     *   const address = server.address();
     *   console.log(`server listening ${address.address}:${address.port}`);
     * });
     *
     * server.bind(41234);
     * // Prints: server listening 0.0.0.0:41234
     * ```
     * @since v0.1.99
     * @param callback with no parameters. Called when binding is complete.
     */
    fun bind(
        port: Number = definedExternally,
        address: String = definedExternally,
        callback: () -> Unit = definedExternally,
    ): Unit /* this */

    fun bind(port: Number = definedExternally, callback: () -> Unit = definedExternally): Unit /* this */
    fun bind(callback: () -> Unit = definedExternally): Unit /* this */
    fun bind(options: BindOptions, callback: () -> Unit = definedExternally): Unit /* this */

    /**
     * Close the underlying socket and stop listening for data on it. If a callback is
     * provided, it is added as a listener for the `'close'` event.
     * @since v0.1.99
     * @param callback Called when the socket has been closed.
     */
    fun close(callback: () -> Unit = definedExternally): Unit /* this */

    /**
     * Associates the `dgram.Socket` to a remote address and port. Every
     * message sent by this handle is automatically sent to that destination. Also,
     * the socket will only receive messages from that remote peer.
     * Trying to call `connect()` on an already connected socket will result
     * in an `ERR_SOCKET_DGRAM_IS_CONNECTED` exception. If `address` is not
     * provided, `'127.0.0.1'` (for `udp4` sockets) or `'::1'` (for `udp6` sockets)
     * will be used by default. Once the connection is complete, a `'connect'` event
     * is emitted and the optional `callback` function is called. In case of failure,
     * the `callback` is called or, failing this, an `'error'` event is emitted.
     * @since v12.0.0
     * @param callback Called when the connection is completed or on error.
     */
    fun connect(port: Number, address: String = definedExternally, callback: () -> Unit = definedExternally): Unit
    fun connect(port: Number, callback: () -> Unit): Unit

    /**
     * A synchronous function that disassociates a connected `dgram.Socket` from
     * its remote address. Trying to call `disconnect()` on an unbound or already
     * disconnected socket will result in an `ERR_SOCKET_DGRAM_NOT_CONNECTED` exception.
     * @since v12.0.0
     */
    fun disconnect(): Unit

    /**
     * Instructs the kernel to leave a multicast group at `multicastAddress` using the`IP_DROP_MEMBERSHIP` socket option. This method is automatically called by the
     * kernel when the socket is closed or the process terminates, so most apps will
     * never have reason to call this.
     *
     * If `multicastInterface` is not specified, the operating system will attempt to
     * drop membership on all valid interfaces.
     * @since v0.6.9
     */
    fun dropMembership(multicastAddress: String, multicastInterface: String = definedExternally): Unit

    /**
     * This method throws `ERR_SOCKET_BUFFER_SIZE` if called on an unbound socket.
     * @since v8.7.0
     * @return the `SO_RCVBUF` socket receive buffer size in bytes.
     */
    fun getRecvBufferSize(): Double

    /**
     * This method throws `ERR_SOCKET_BUFFER_SIZE` if called on an unbound socket.
     * @since v8.7.0
     * @return the `SO_SNDBUF` socket send buffer size in bytes.
     */
    fun getSendBufferSize(): Double

    /**
     * By default, binding a socket will cause it to block the Node.js process from
     * exiting as long as the socket is open. The `socket.unref()` method can be used
     * to exclude the socket from the reference counting that keeps the Node.js
     * process active. The `socket.ref()` method adds the socket back to the reference
     * counting and restores the default behavior.
     *
     * Calling `socket.ref()` multiples times will have no additional effect.
     *
     * The `socket.ref()` method returns a reference to the socket so calls can be
     * chained.
     * @since v0.9.1
     */
    fun ref(): Unit /* this */

    /**
     * Returns an object containing the `address`, `family`, and `port` of the remote
     * endpoint. This method throws an `ERR_SOCKET_DGRAM_NOT_CONNECTED` exception
     * if the socket is not connected.
     * @since v12.0.0
     */
    fun remoteAddress(): AddressInfo

    /**
     * Broadcasts a datagram on the socket.
     * For connectionless sockets, the destination `port` and `address` must be
     * specified. Connected sockets, on the other hand, will use their associated
     * remote endpoint, so the `port` and `address` arguments must not be set.
     *
     * The `msg` argument contains the message to be sent.
     * Depending on its type, different behavior can apply. If `msg` is a `Buffer`,
     * any `TypedArray` or a `DataView`,
     * the `offset` and `length` specify the offset within the `Buffer` where the
     * message begins and the number of bytes in the message, respectively.
     * If `msg` is a `String`, then it is automatically converted to a `Buffer`with `'utf8'` encoding. With messages that
     * contain multi-byte characters, `offset` and `length` will be calculated with
     * respect to `byte length` and not the character position.
     * If `msg` is an array, `offset` and `length` must not be specified.
     *
     * The `address` argument is a string. If the value of `address` is a host name,
     * DNS will be used to resolve the address of the host. If `address` is not
     * provided or otherwise nullish, `'127.0.0.1'` (for `udp4` sockets) or `'::1'`(for `udp6` sockets) will be used by default.
     *
     * If the socket has not been previously bound with a call to `bind`, the socket
     * is assigned a random port number and is bound to the "all interfaces" address
     * (`'0.0.0.0'` for `udp4` sockets, `'::0'` for `udp6` sockets.)
     *
     * An optional `callback` function may be specified to as a way of reporting
     * DNS errors or for determining when it is safe to reuse the `buf` object.
     * DNS lookups delay the time to send for at least one tick of the
     * Node.js event loop.
     *
     * The only way to know for sure that the datagram has been sent is by using a`callback`. If an error occurs and a `callback` is given, the error will be
     * passed as the first argument to the `callback`. If a `callback` is not given,
     * the error is emitted as an `'error'` event on the `socket` object.
     *
     * Offset and length are optional but both _must_ be set if either are used.
     * They are supported only when the first argument is a `Buffer`, a `TypedArray`,
     * or a `DataView`.
     *
     * This method throws `ERR_SOCKET_BAD_PORT` if called on an unbound socket.
     *
     * Example of sending a UDP packet to a port on `localhost`;
     *
     * ```js
     * import dgram from 'dgram';
     * import { Buffer } from 'buffer';
     *
     * const message = Buffer.from('Some bytes');
     * const client = dgram.createSocket('udp4');
     * client.send(message, 41234, 'localhost', (err) => {
     *   client.close();
     * });
     * ```
     *
     * Example of sending a UDP packet composed of multiple buffers to a port on`127.0.0.1`;
     *
     * ```js
     * import dgram from 'dgram';
     * import { Buffer } from 'buffer';
     *
     * const buf1 = Buffer.from('Some ');
     * const buf2 = Buffer.from('bytes');
     * const client = dgram.createSocket('udp4');
     * client.send([buf1, buf2], 41234, (err) => {
     *   client.close();
     * });
     * ```
     *
     * Sending multiple buffers might be faster or slower depending on the
     * application and operating system. Run benchmarks to
     * determine the optimal strategy on a case-by-case basis. Generally speaking,
     * however, sending multiple buffers is faster.
     *
     * Example of sending a UDP packet using a socket connected to a port on`localhost`:
     *
     * ```js
     * import dgram from 'dgram';
     * import { Buffer } from 'buffer';
     *
     * const message = Buffer.from('Some bytes');
     * const client = dgram.createSocket('udp4');
     * client.connect(41234, 'localhost', (err) => {
     *   client.send(message, (err) => {
     *     client.close();
     *   });
     * });
     * ```
     * @since v0.1.99
     * @param msg Message to be sent.
     * @param offset Offset in the buffer where the message starts.
     * @param length Number of bytes in the message.
     * @param port Destination port.
     * @param address Destination host name or IP address.
     * @param callback Called when the message has been sent.
     */
    fun send(
        msg: String,
        port: Number = definedExternally,
        address: String = definedExternally,
        callback: (error: Throwable /* JsError */?, bytes: Double) -> Unit = definedExternally,
    ): Unit

    fun send(
        msg: Uint8Array,
        port: Number = definedExternally,
        address: String = definedExternally,
        callback: (error: Throwable /* JsError */?, bytes: Double) -> Unit = definedExternally,
    ): Unit

    fun send(
        msg: ReadonlyArray<Any?>,
        port: Number = definedExternally,
        address: String = definedExternally,
        callback: (error: Throwable /* JsError */?, bytes: Double) -> Unit = definedExternally,
    ): Unit

    fun send(
        msg: String,
        port: Number = definedExternally,
        callback: (error: Throwable /* JsError */?, bytes: Double) -> Unit = definedExternally,
    ): Unit

    fun send(
        msg: Uint8Array,
        port: Number = definedExternally,
        callback: (error: Throwable /* JsError */?, bytes: Double) -> Unit = definedExternally,
    ): Unit

    fun send(
        msg: ReadonlyArray<Any?>,
        port: Number = definedExternally,
        callback: (error: Throwable /* JsError */?, bytes: Double) -> Unit = definedExternally,
    ): Unit

    fun send(msg: String, callback: (error: Throwable /* JsError */?, bytes: Double) -> Unit = definedExternally): Unit

    fun send(
        msg: Uint8Array,
        callback: (error: Throwable /* JsError */?, bytes: Double) -> Unit = definedExternally,
    ): Unit

    fun send(
        msg: ReadonlyArray<Any?>,
        callback: (error: Throwable /* JsError */?, bytes: Double) -> Unit = definedExternally,
    ): Unit

    fun send(
        msg: String,
        offset: Number,
        length: Number,
        port: Number = definedExternally,
        address: String = definedExternally,
        callback: (error: Throwable /* JsError */?, bytes: Double) -> Unit = definedExternally,
    ): Unit

    fun send(
        msg: Uint8Array,
        offset: Number,
        length: Number,
        port: Number = definedExternally,
        address: String = definedExternally,
        callback: (error: Throwable /* JsError */?, bytes: Double) -> Unit = definedExternally,
    ): Unit

    fun send(
        msg: String,
        offset: Number,
        length: Number,
        port: Number = definedExternally,
        callback: (error: Throwable /* JsError */?, bytes: Double) -> Unit = definedExternally,
    ): Unit

    fun send(
        msg: Uint8Array,
        offset: Number,
        length: Number,
        port: Number = definedExternally,
        callback: (error: Throwable /* JsError */?, bytes: Double) -> Unit = definedExternally,
    ): Unit

    fun send(
        msg: String,
        offset: Number,
        length: Number,
        callback: (error: Throwable /* JsError */?, bytes: Double) -> Unit = definedExternally,
    ): Unit

    fun send(
        msg: Uint8Array,
        offset: Number,
        length: Number,
        callback: (error: Throwable /* JsError */?, bytes: Double) -> Unit = definedExternally,
    ): Unit

    /**
     * Sets or clears the `SO_BROADCAST` socket option. When set to `true`, UDP
     * packets may be sent to a local interface's broadcast address.
     *
     * This method throws `EBADF` if called on an unbound socket.
     * @since v0.6.9
     */
    fun setBroadcast(flag: Boolean): Unit

    /**
     * _All references to scope in this section are referring to [IPv6 Zone Indices](https://en.wikipedia.org/wiki/IPv6_address#Scoped_literal_IPv6_addresses), which are defined by [RFC
         * 4007](https://tools.ietf.org/html/rfc4007). In string form, an IP_
     * _with a scope index is written as `'IP%scope'` where scope is an interface name_
     * _or interface number._
     *
     * Sets the default outgoing multicast interface of the socket to a chosen
     * interface or back to system interface selection. The `multicastInterface` must
     * be a valid string representation of an IP from the socket's family.
     *
     * For IPv4 sockets, this should be the IP configured for the desired physical
     * interface. All packets sent to multicast on the socket will be sent on the
     * interface determined by the most recent successful use of this call.
     *
     * For IPv6 sockets, `multicastInterface` should include a scope to indicate the
     * interface as in the examples that follow. In IPv6, individual `send` calls can
     * also use explicit scope in addresses, so only packets sent to a multicast
     * address without specifying an explicit scope are affected by the most recent
     * successful use of this call.
     *
     * This method throws `EBADF` if called on an unbound socket.
     *
     * #### Example: IPv6 outgoing multicast interface
     *
     * On most systems, where scope format uses the interface name:
     *
     * ```js
     * const socket = dgram.createSocket('udp6');
     *
     * socket.bind(1234, () => {
     *   socket.setMulticastInterface('::%eth1');
     * });
     * ```
     *
     * On Windows, where scope format uses an interface number:
     *
     * ```js
     * const socket = dgram.createSocket('udp6');
     *
     * socket.bind(1234, () => {
     *   socket.setMulticastInterface('::%2');
     * });
     * ```
     *
     * #### Example: IPv4 outgoing multicast interface
     *
     * All systems use an IP of the host on the desired physical interface:
     *
     * ```js
     * const socket = dgram.createSocket('udp4');
     *
     * socket.bind(1234, () => {
     *   socket.setMulticastInterface('10.0.0.2');
     * });
     * ```
     * @since v8.6.0
     */
    fun setMulticastInterface(multicastInterface: String): Unit

    /**
     * Sets or clears the `IP_MULTICAST_LOOP` socket option. When set to `true`,
     * multicast packets will also be received on the local interface.
     *
     * This method throws `EBADF` if called on an unbound socket.
     * @since v0.3.8
     */
    fun setMulticastLoopback(flag: Boolean): Boolean

    /**
     * Sets the `IP_MULTICAST_TTL` socket option. While TTL generally stands for
     * "Time to Live", in this context it specifies the number of IP hops that a
     * packet is allowed to travel through, specifically for multicast traffic. Each
     * router or gateway that forwards a packet decrements the TTL. If the TTL is
     * decremented to 0 by a router, it will not be forwarded.
     *
     * The `ttl` argument may be between 0 and 255\. The default on most systems is `1`.
     *
     * This method throws `EBADF` if called on an unbound socket.
     * @since v0.3.8
     */
    fun setMulticastTTL(ttl: Number): Double

    /**
     * Sets the `SO_RCVBUF` socket option. Sets the maximum socket receive buffer
     * in bytes.
     *
     * This method throws `ERR_SOCKET_BUFFER_SIZE` if called on an unbound socket.
     * @since v8.7.0
     */
    fun setRecvBufferSize(size: Number): Unit

    /**
     * Sets the `SO_SNDBUF` socket option. Sets the maximum socket send buffer
     * in bytes.
     *
     * This method throws `ERR_SOCKET_BUFFER_SIZE` if called on an unbound socket.
     * @since v8.7.0
     */
    fun setSendBufferSize(size: Number): Unit

    /**
     * Sets the `IP_TTL` socket option. While TTL generally stands for "Time to Live",
     * in this context it specifies the number of IP hops that a packet is allowed to
     * travel through. Each router or gateway that forwards a packet decrements the
     * TTL. If the TTL is decremented to 0 by a router, it will not be forwarded.
     * Changing TTL values is typically done for network probes or when multicasting.
     *
     * The `ttl` argument may be between 1 and 255\. The default on most systems
     * is 64.
     *
     * This method throws `EBADF` if called on an unbound socket.
     * @since v0.1.101
     */
    fun setTTL(ttl: Number): Double

    /**
     * By default, binding a socket will cause it to block the Node.js process from
     * exiting as long as the socket is open. The `socket.unref()` method can be used
     * to exclude the socket from the reference counting that keeps the Node.js
     * process active, allowing the process to exit even if the socket is still
     * listening.
     *
     * Calling `socket.unref()` multiple times will have no addition effect.
     *
     * The `socket.unref()` method returns a reference to the socket so calls can be
     * chained.
     * @since v0.9.1
     */
    fun unref(): Unit /* this */

    /**
     * Tells the kernel to join a source-specific multicast channel at the given`sourceAddress` and `groupAddress`, using the `multicastInterface` with the`IP_ADD_SOURCE_MEMBERSHIP` socket
     * option. If the `multicastInterface` argument
     * is not specified, the operating system will choose one interface and will add
     * membership to it. To add membership to every available interface, call`socket.addSourceSpecificMembership()` multiple times, once per interface.
     *
     * When called on an unbound socket, this method will implicitly bind to a random
     * port, listening on all interfaces.
     * @since v13.1.0, v12.16.0
     */
    fun addSourceSpecificMembership(
        sourceAddress: String,
        groupAddress: String,
        multicastInterface: String = definedExternally,
    ): Unit

    /**
     * Instructs the kernel to leave a source-specific multicast channel at the given`sourceAddress` and `groupAddress` using the `IP_DROP_SOURCE_MEMBERSHIP`socket option. This method is
     * automatically called by the kernel when the
     * socket is closed or the process terminates, so most apps will never have
     * reason to call this.
     *
     * If `multicastInterface` is not specified, the operating system will attempt to
     * drop membership on all valid interfaces.
     * @since v13.1.0, v12.16.0
     */
    fun dropSourceSpecificMembership(
        sourceAddress: String,
        groupAddress: String,
        multicastInterface: String = definedExternally,
    ): Unit

    /**
     * events.EventEmitter
     * 1. close
     * 2. connect
     * 3. error
     * 4. listening
     * 5. message
     */
    fun addListener(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun addListener(event: SocketEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun addListener(event: SocketEvent.CONNECT, listener: () -> Unit): Unit /* this */
    fun addListener(event: SocketEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun addListener(event: SocketEvent.LISTENING, listener: () -> Unit): Unit /* this */
    fun addListener(
        event: SocketEvent.MESSAGE,
        listener: (msg: node.buffer.Buffer, rinfo: RemoteInfo) -> Unit,
    ): Unit /* this */

    fun emit(event: String, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Boolean

    fun emit(event: js.core.Symbol, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Boolean
    fun emit(event: SocketEvent.CLOSE): Boolean
    fun emit(event: SocketEvent.CONNECT): Boolean
    fun emit(event: SocketEvent.ERROR, err: Throwable /* JsError */): Boolean
    fun emit(event: SocketEvent.LISTENING): Boolean
    fun emit(event: SocketEvent.MESSAGE, msg: node.buffer.Buffer, rinfo: RemoteInfo): Boolean
    fun on(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun on(event: SocketEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun on(event: SocketEvent.CONNECT, listener: () -> Unit): Unit /* this */
    fun on(event: SocketEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun on(event: SocketEvent.LISTENING, listener: () -> Unit): Unit /* this */
    fun on(event: SocketEvent.MESSAGE, listener: (msg: node.buffer.Buffer, rinfo: RemoteInfo) -> Unit): Unit /* this */
    fun once(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun once(event: SocketEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun once(event: SocketEvent.CONNECT, listener: () -> Unit): Unit /* this */
    fun once(event: SocketEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun once(event: SocketEvent.LISTENING, listener: () -> Unit): Unit /* this */
    fun once(
        event: SocketEvent.MESSAGE,
        listener: (msg: node.buffer.Buffer, rinfo: RemoteInfo) -> Unit,
    ): Unit /* this */

    fun prependListener(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun prependListener(event: SocketEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependListener(event: SocketEvent.CONNECT, listener: () -> Unit): Unit /* this */
    fun prependListener(event: SocketEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun prependListener(event: SocketEvent.LISTENING, listener: () -> Unit): Unit /* this */
    fun prependListener(
        event: SocketEvent.MESSAGE,
        listener: (msg: node.buffer.Buffer, rinfo: RemoteInfo) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun prependOnceListener(event: SocketEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: SocketEvent.CONNECT, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: SocketEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun prependOnceListener(event: SocketEvent.LISTENING, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: SocketEvent.MESSAGE,
        listener: (msg: node.buffer.Buffer, rinfo: RemoteInfo) -> Unit,
    ): Unit /* this */
}
