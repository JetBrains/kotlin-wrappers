// Automatically generated - do not modify!

@file:JsModule("node:net")
@file:JsNonModule

package node.net

/**
 * Creates a new TCP or `IPC` server.
 *
 * If `allowHalfOpen` is set to `true`, when the other end of the socket
 * signals the end of transmission, the server will only send back the end of
 * transmission when `socket.end()` is explicitly called. For example, in the
 * context of TCP, when a FIN packed is received, a FIN packed is sent
 * back only when `socket.end()` is explicitly called. Until then the
 * connection is half-closed (non-readable but still writable). See `'end'` event and [RFC 1122](https://tools.ietf.org/html/rfc1122) (section 4.2.2.13) for more information.
 *
 * If `pauseOnConnect` is set to `true`, then the socket associated with each
 * incoming connection will be paused, and no data will be read from its handle.
 * This allows connections to be passed between processes without any data being
 * read by the original process. To begin reading data from a paused socket, call `socket.resume()`.
 *
 * The server can be a TCP server or an `IPC` server, depending on what it `listen()` to.
 *
 * Here is an example of a TCP echo server which listens for connections
 * on port 8124:
 *
 * ```js
 * const net = require('net');
 * const server = net.createServer((c) => {
 *   // 'connection' listener.
 *   console.log('client connected');
 *   c.on('end', () => {
 *     console.log('client disconnected');
 *   });
 *   c.write('hello\r\n');
 *   c.pipe(c);
 * });
 * server.on('error', (err) => {
 *   throw err;
 * });
 * server.listen(8124, () => {
 *   console.log('server bound');
 * });
 * ```
 *
 * Test this by using `telnet`:
 *
 * ```console
 * $ telnet localhost 8124
 * ```
 *
 * To listen on the socket `/tmp/echo.sock`:
 *
 * ```js
 * server.listen('/tmp/echo.sock', () => {
 *   console.log('server bound');
 * });
 * ```
 *
 * Use `nc` to connect to a Unix domain socket server:
 *
 * ```console
 * $ nc -U /tmp/echo.sock
 * ```
 * @since v0.5.0
 * @param connectionListener Automatically set as a listener for the {@link 'connection'} event.
 */
external fun createServer(
    connectionListener: (socket: Socket) -> Unit = definedExternally,
): Server


/**
 * Creates a new TCP or `IPC` server.
 *
 * If `allowHalfOpen` is set to `true`, when the other end of the socket
 * signals the end of transmission, the server will only send back the end of
 * transmission when `socket.end()` is explicitly called. For example, in the
 * context of TCP, when a FIN packed is received, a FIN packed is sent
 * back only when `socket.end()` is explicitly called. Until then the
 * connection is half-closed (non-readable but still writable). See `'end'` event and [RFC 1122](https://tools.ietf.org/html/rfc1122) (section 4.2.2.13) for more information.
 *
 * If `pauseOnConnect` is set to `true`, then the socket associated with each
 * incoming connection will be paused, and no data will be read from its handle.
 * This allows connections to be passed between processes without any data being
 * read by the original process. To begin reading data from a paused socket, call `socket.resume()`.
 *
 * The server can be a TCP server or an `IPC` server, depending on what it `listen()` to.
 *
 * Here is an example of a TCP echo server which listens for connections
 * on port 8124:
 *
 * ```js
 * const net = require('net');
 * const server = net.createServer((c) => {
 *   // 'connection' listener.
 *   console.log('client connected');
 *   c.on('end', () => {
 *     console.log('client disconnected');
 *   });
 *   c.write('hello\r\n');
 *   c.pipe(c);
 * });
 * server.on('error', (err) => {
 *   throw err;
 * });
 * server.listen(8124, () => {
 *   console.log('server bound');
 * });
 * ```
 *
 * Test this by using `telnet`:
 *
 * ```console
 * $ telnet localhost 8124
 * ```
 *
 * To listen on the socket `/tmp/echo.sock`:
 *
 * ```js
 * server.listen('/tmp/echo.sock', () => {
 *   console.log('server bound');
 * });
 * ```
 *
 * Use `nc` to connect to a Unix domain socket server:
 *
 * ```console
 * $ nc -U /tmp/echo.sock
 * ```
 * @since v0.5.0
 * @param connectionListener Automatically set as a listener for the {@link 'connection'} event.
 */
external fun createServer(
    options: ServerOpts = definedExternally,
    connectionListener: (socket: Socket) -> Unit = definedExternally,
): Server
