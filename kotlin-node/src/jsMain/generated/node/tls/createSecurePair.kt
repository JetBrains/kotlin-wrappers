@file:JsModule("node:tls")

package node.tls


/**
 * Creates a new secure pair object with two streams, one of which reads and writes
 * the encrypted data and the other of which reads and writes the cleartext data.
 * Generally, the encrypted stream is piped to/from an incoming encrypted data
 * stream and the cleartext one is used as a replacement for the initial encrypted
 * stream.
 *
 * `tls.createSecurePair()` returns a `tls.SecurePair` object with `cleartext` and`encrypted` stream properties.
 *
 * Using `cleartext` has the same API as {@link TLSSocket}.
 *
 * The `tls.createSecurePair()` method is now deprecated in favor of`tls.TLSSocket()`. For example, the code:
 *
 * ```js
 * pair = tls.createSecurePair(// ... );
 * pair.encrypted.pipe(socket);
 * socket.pipe(pair.encrypted);
 * ```
 *
 * can be replaced by:
 *
 * ```js
 * secureSocket = tls.TLSSocket(socket, options);
 * ```
 *
 * where `secureSocket` has the same API as `pair.cleartext`.
 * @since v0.3.2
 * @deprecated Since v0.11.3 - Use {@link TLSSocket} instead.
 * @param context A secure context object as returned by `tls.createSecureContext()`
 * @param isServer `true` to specify that this TLS connection should be opened as a server.
 * @param requestCert `true` to specify whether a server should request a certificate from a connecting client. Only applies when `isServer` is `true`.
 * @param rejectUnauthorized If not `false` a server automatically reject clients with invalid certificates. Only applies when `isServer` is `true`.
 */
external fun createSecurePair(
    context: SecureContext = definedExternally,
    isServer: Boolean = definedExternally,
    requestCert: Boolean = definedExternally,
    rejectUnauthorized: Boolean = definedExternally
): SecurePair
