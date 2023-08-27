@file:JsModule("node:tls")

package node.tls


/**
 * Creates a new {@link Server}. The `secureConnectionListener`, if provided, is
 * automatically set as a listener for the `'secureConnection'` event.
 *
 * The `ticketKeys` options is automatically shared between `cluster` module
 * workers.
 *
 * The following illustrates a simple echo server:
 *
 * ```js
 * const tls = require('tls');
 * const fs = require('fs');
 *
 * const options = {
 *   key: fs.readFileSync('server-key.pem'),
 *   cert: fs.readFileSync('server-cert.pem'),
 *
 *   // This is necessary only if using client certificate authentication.
 *   requestCert: true,
 *
 *   // This is necessary only if the client uses a self-signed certificate.
 *   ca: [ fs.readFileSync('client-cert.pem') ]
 * };
 *
 * const server = tls.createServer(options, (socket) => {
 *   console.log('server connected',
 *               socket.authorized ? 'authorized' : 'unauthorized');
 *   socket.write('welcome!\n');
 *   socket.setEncoding('utf8');
 *   socket.pipe(socket);
 * });
 * server.listen(8000, () => {
 *   console.log('server bound');
 * });
 * ```
 *
 * The server can be tested by connecting to it using the example client from {@link connect}.
 * @since v0.3.2
 */
external fun createServer(secureConnectionListener: (socket: TLSSocket) -> Unit = definedExternally): Server

external fun createServer(options: TlsOptions, secureConnectionListener: (socket: TLSSocket) -> Unit = definedExternally): Server
