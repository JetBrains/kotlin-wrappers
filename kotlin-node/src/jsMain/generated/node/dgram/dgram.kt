@file:JsModule("node:dgram")

package node.dgram


/**
 * The `dgram` module provides an implementation of UDP datagram sockets.
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
 * @see [source](https://github.com/nodejs/node/blob/v18.0.0/lib/dgram.js)
 */
