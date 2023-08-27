@file:JsModule("node:tls")

package node.tls


/**
 * The `callback` function, if specified, will be added as a listener for the `'secureConnect'` event.
 *
 * `tls.connect()` returns a {@link TLSSocket} object.
 *
 * Unlike the `https` API, `tls.connect()` does not enable the
 * SNI (Server Name Indication) extension by default, which may cause some
 * servers to return an incorrect certificate or reject the connection
 * altogether. To enable SNI, set the `servername` option in addition
 * to `host`.
 *
 * The following illustrates a client for the echo server example from {@link createServer}:
 *
 * ```js
 * // Assumes an echo server that is listening on port 8000.
 * const tls = require('tls');
 * const fs = require('fs');
 *
 * const options = {
 *   // Necessary only if the server requires client certificate authentication.
 *   key: fs.readFileSync('client-key.pem'),
 *   cert: fs.readFileSync('client-cert.pem'),
 *
 *   // Necessary only if the server uses a self-signed certificate.
 *   ca: [ fs.readFileSync('server-cert.pem') ],
 *
 *   // Necessary only if the server's cert isn't for "localhost".
 *   checkServerIdentity: () => { return null; },
 * };
 *
 * const socket = tls.connect(8000, options, () => {
 *   console.log('client connected',
 *               socket.authorized ? 'authorized' : 'unauthorized');
 *   process.stdin.pipe(socket);
 *   process.stdin.resume();
 * });
 * socket.setEncoding('utf8');
 * socket.on('data', (data) => {
 *   console.log(data);
 * });
 * socket.on('end', () => {
 *   console.log('server ends connection');
 * });
 * ```
 * @since v0.11.3
 */
external fun connect(options: ConnectionOptions, secureConnectListener: () -> Unit = definedExternally): TLSSocket

external fun connect(port: Double, host: String = definedExternally, options: ConnectionOptions = definedExternally, secureConnectListener: () -> Unit = definedExternally): TLSSocket

external fun connect(port: Double, options: ConnectionOptions = definedExternally, secureConnectListener: () -> Unit = definedExternally): TLSSocket
