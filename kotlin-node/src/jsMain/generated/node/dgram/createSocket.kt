@file:JsModule("node:dgram")

package node.dgram

import node.buffer.Buffer

/**
 * Creates a `dgram.Socket` object. Once the socket is created, calling `socket.bind()` will instruct the socket to begin listening for datagram
 * messages. When `address` and `port` are not passed to `socket.bind()` the
 * method will bind the socket to the "all interfaces" address on a random port
 * (it does the right thing for both `udp4` and `udp6` sockets). The bound address
 * and port can be retrieved using `socket.address().address` and `socket.address().port`.
 *
 * If the `signal` option is enabled, calling `.abort()` on the corresponding`AbortController` is similar to calling `.close()` on the socket:
 *
 * ```js
 * const controller = new AbortController();
 * const { signal } = controller;
 * const server = dgram.createSocket({ type: 'udp4', signal });
 * server.on('message', (msg, rinfo) => {
 *   console.log(`server got: ${msg} from ${rinfo.address}:${rinfo.port}`);
 * });
 * // Later, when you want to close the server.
 * controller.abort();
 * ```
 * @since v0.11.13
 * @param options Available options are:
 * @param callback Attached as a listener for `'message'` events. Optional.
 */
external fun createSocket(
    type: SocketType,
    callback: (msg: Buffer, rinfo: RemoteInfo) -> Unit = definedExternally,
): Socket

external fun createSocket(
    options: SocketOptions,
    callback: (msg: Buffer, rinfo: RemoteInfo) -> Unit = definedExternally,
): Socket
