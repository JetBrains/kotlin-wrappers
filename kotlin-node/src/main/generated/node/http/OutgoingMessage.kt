// Automatically generated - do not modify!

@file:JsModule("node:http")
@file:JsNonModule

package node.http

import js.core.ReadonlyArray
import node.net.Socket
import node.stream.Writable

open external class OutgoingMessage<Request : IncomingMessage> : Writable {
    open val req: Request
    open var chunkedEncoding: Boolean
    open var shouldKeepAlive: Boolean
    open var useChunkedEncodingByDefault: Boolean
    open var sendDate: Boolean

    /**
     * @deprecated Use `writableEnded` instead.
     */
    open var finished: Boolean

    /**
     * Read-only. `true` if the headers were sent, otherwise `false`.
     * @since v0.9.3
     */
    open val headersSent: Boolean

    /**
     * Aliases of `outgoingMessage.socket`
     * @since v0.3.0
     * @deprecated Since v15.12.0,v14.17.1 - Use `socket` instead.
     */
    open val connection: Socket?

    /**
     * Reference to the underlying socket. Usually, users will not want to access
     * this property.
     *
     * After calling `outgoingMessage.end()`, this property will be nulled.
     * @since v0.3.0
     */
    open val socket: Socket?

    constructor()

    /**
     * Once a socket is associated with the message and is connected,`socket.setTimeout()` will be called with `msecs` as the first parameter.
     * @since v0.9.12
     * @param callback Optional function to be called when a timeout occurs. Same as binding to the `timeout` event.
     */
    open fun setTimeout(
        msecs: Number,
        callback: () -> Unit = definedExternally,
    ) /* : this */

    /**
     * Sets a single header value for the header object.
     * @since v0.4.0
     * @param name Header name
     * @param value Header value
     */
    open fun setHeader(
        name: String,
        value: Any, /* number | string | ReadonlyArray<string> */
    ) /* : this */

    /**
     * Gets the value of HTTP header with the given name. If such a name doesn't
     * exist in message, it will be `undefined`.
     * @since v0.4.0
     * @param name Name of header
     */
    open fun getHeader(name: String): Any /* number | string | string[] */

    /**
     * Returns a shallow copy of the current outgoing headers. Since a shallow
     * copy is used, array values may be mutated without additional calls to
     * various header-related HTTP module methods. The keys of the returned
     * object are the header names and the values are the respective header
     * values. All header names are lowercase.
     *
     * The object returned by the `outgoingMessage.getHeaders()` method does
     * not prototypically inherit from the JavaScript Object. This means that
     * typical Object methods such as `obj.toString()`, `obj.hasOwnProperty()`,
     * and others are not defined and will not work.
     *
     * ```js
     * outgoingMessage.setHeader('Foo', 'bar');
     * outgoingMessage.setHeader('Set-Cookie', ['foo=bar', 'bar=baz']);
     *
     * const headers = outgoingMessage.getHeaders();
     * // headers === { foo: 'bar', 'set-cookie': ['foo=bar', 'bar=baz'] }
     * ```
     * @since v7.7.0
     */
    open fun getHeaders(): OutgoingHttpHeaders

    /**
     * Returns an array of names of headers of the outgoing outgoingMessage. All
     * names are lowercase.
     * @since v7.7.0
     */
    open fun getHeaderNames(): ReadonlyArray<String>

    /**
     * Returns `true` if the header identified by `name` is currently set in the
     * outgoing headers. The header name is case-insensitive.
     *
     * ```js
     * const hasContentType = outgoingMessage.hasHeader('content-type');
     * ```
     * @since v7.7.0
     */
    open fun hasHeader(name: String): Boolean

    /**
     * Removes a header that is queued for implicit sending.
     *
     * ```js
     * outgoingMessage.removeHeader('Content-Encoding');
     * ```
     * @since v0.4.0
     * @param name Header name
     */
    open fun removeHeader(name: String)

    /**
     * Adds HTTP trailers (headers but at the end of the message) to the message.
     *
     * Trailers are **only** be emitted if the message is chunked encoded. If not,
     * the trailer will be silently discarded.
     *
     * HTTP requires the `Trailer` header to be sent to emit trailers,
     * with a list of header fields in its value, e.g.
     *
     * ```js
     * message.writeHead(200, { 'Content-Type': 'text/plain',
     *                          'Trailer': 'Content-MD5' });
     * message.write(fileData);
     * message.addTrailers({ 'Content-MD5': '7895bf4b8828b55ceaf47747b4bca667' });
     * message.end();
     * ```
     *
     * Attempting to set a header field name or value that contains invalid characters
     * will result in a `TypeError` being thrown.
     * @since v0.3.0
     */
    open fun addTrailers(headers: OutgoingHttpHeaders)

    /**
     * Compulsorily flushes the message headers
     *
     * For efficiency reason, Node.js normally buffers the message headers
     * until `outgoingMessage.end()` is called or the first chunk of message data
     * is written. It then tries to pack the headers and data into a single TCP
     * packet.
     *
     * It is usually desired (it saves a TCP round-trip), but not when the first
     * data is not sent until possibly much later. `outgoingMessage.flushHeaders()`bypasses the optimization and kickstarts the request.
     * @since v1.6.0
     */
    open fun flushHeaders()
}
