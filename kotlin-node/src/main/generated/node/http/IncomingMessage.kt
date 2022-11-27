// Automatically generated - do not modify!

@file:JsModule("node:http")
@file:JsNonModule

package node.http

import js.core.ReadonlyArray
import node.Dict
import node.net.Socket
import node.stream.Readable

open external class IncomingMessage : Readable {
    constructor(socket: Socket)

    /**
     * The `message.aborted` property will be `true` if the request has
     * been aborted.
     * @since v10.1.0
     * @deprecated Since v17.0.0,v16.12.0 - Check `message.destroyed` from <a href="stream.html#class-streamreadable" class="type">stream.Readable</a>.
     */
    open var aborted: Boolean

    /**
     * In case of server request, the HTTP version sent by the client. In the case of
     * client response, the HTTP version of the connected-to server.
     * Probably either `'1.1'` or `'1.0'`.
     *
     * Also `message.httpVersionMajor` is the first integer and`message.httpVersionMinor` is the second.
     * @since v0.1.1
     */
    open var httpVersion: String
    open var httpVersionMajor: Number
    open var httpVersionMinor: Number

    /**
     * The `message.complete` property will be `true` if a complete HTTP message has
     * been received and successfully parsed.
     *
     * This property is particularly useful as a means of determining if a client or
     * server fully transmitted a message before a connection was terminated:
     *
     * ```js
     * const req = http.request({
     *   host: '127.0.0.1',
     *   port: 8080,
     *   method: 'POST'
     * }, (res) => {
     *   res.resume();
     *   res.on('end', () => {
     *     if (!res.complete)
     *       console.error(
     *         'The connection was terminated while the message was still being sent');
     *   });
     * });
     * ```
     * @since v0.3.0
     */
    open var complete: Boolean

    /**
     * Alias for `message.socket`.
     * @since v0.1.90
     * @deprecated Since v16.0.0 - Use `socket`.
     */
    open var connection: Socket

    /**
     * The `net.Socket` object associated with the connection.
     *
     * With HTTPS support, use `request.socket.getPeerCertificate()` to obtain the
     * client's authentication details.
     *
     * This property is guaranteed to be an instance of the `net.Socket` class,
     * a subclass of `stream.Duplex`, unless the user specified a socket
     * type other than `net.Socket` or internally nulled.
     * @since v0.3.0
     */
    open var socket: Socket

    /**
     * The request/response headers object.
     *
     * Key-value pairs of header names and values. Header names are lower-cased.
     *
     * ```js
     * // Prints something like:
     * //
     * // { 'user-agent': 'curl/7.22.0',
     * //   host: '127.0.0.1:8000',
     * //   accept: '*' }
     * console.log(request.getHeaders());
     * ```
     *
     * Duplicates in raw headers are handled in the following ways, depending on the
     * header name:
     *
     * * Duplicates of `age`, `authorization`, `content-length`, `content-type`,`etag`, `expires`, `from`, `host`, `if-modified-since`, `if-unmodified-since`,`last-modified`, `location`,
     * `max-forwards`, `proxy-authorization`, `referer`,`retry-after`, `server`, or `user-agent` are discarded.
     * * `set-cookie` is always an array. Duplicates are added to the array.
     * * For duplicate `cookie` headers, the values are joined together with '; '.
     * * For all other headers, the values are joined together with ', '.
     * @since v0.1.5
     */
    open var headers: IncomingHttpHeaders

    /**
     * The raw request/response headers list exactly as they were received.
     *
     * The keys and values are in the same list. It is _not_ a
     * list of tuples. So, the even-numbered offsets are key values, and the
     * odd-numbered offsets are the associated values.
     *
     * Header names are not lowercased, and duplicates are not merged.
     *
     * ```js
     * // Prints something like:
     * //
     * // [ 'user-agent',
     * //   'this is invalid because there can be only one',
     * //   'User-Agent',
     * //   'curl/7.22.0',
     * //   'Host',
     * //   '127.0.0.1:8000',
     * //   'ACCEPT',
     * //   '*' ]
     * console.log(request.rawHeaders);
     * ```
     * @since v0.11.6
     */
    open var rawHeaders: ReadonlyArray<String>

    /**
     * The request/response trailers object. Only populated at the `'end'` event.
     * @since v0.3.0
     */
    open var trailers: Dict<String>

    /**
     * The raw request/response trailer keys and values exactly as they were
     * received. Only populated at the `'end'` event.
     * @since v0.11.6
     */
    open var rawTrailers: ReadonlyArray<String>

    /**
     * Calls `message.socket.setTimeout(msecs, callback)`.
     * @since v0.5.9
     */
    open fun setTimeout(
        msecs: Number,
        callback: () -> Unit = definedExternally,
    ) /* : this */

    /**
     * **Only valid for request obtained from {@link Server}.**
     *
     * The request method as a string. Read only. Examples: `'GET'`, `'DELETE'`.
     * @since v0.1.1
     */
    open var method: String?

    /**
     * **Only valid for request obtained from {@link Server}.**
     *
     * Request URL string. This contains only the URL that is present in the actual
     * HTTP request. Take the following request:
     *
     * ```http
     * GET /status?name=ryan HTTP/1.1
     * Accept: text/plain
     * ```
     *
     * To parse the URL into its parts:
     *
     * ```js
     * new URL(request.url, `http://${request.getHeaders().host}`);
     * ```
     *
     * When `request.url` is `'/status?name=ryan'` and`request.getHeaders().host` is `'localhost:3000'`:
     *
     * ```console
     * $ node
     * > new URL(request.url, `http://${request.getHeaders().host}`)
     * URL {
     *   href: 'http://localhost:3000/status?name=ryan',
     *   origin: 'http://localhost:3000',
     *   protocol: 'http:',
     *   username: '',
     *   password: '',
     *   host: 'localhost:3000',
     *   hostname: 'localhost',
     *   port: '3000',
     *   pathname: '/status',
     *   search: '?name=ryan',
     *   searchParams: URLSearchParams { 'name' => 'ryan' },
     *   hash: ''
     * }
     * ```
     * @since v0.1.90
     */
    open var url: String?

    /**
     * **Only valid for response obtained from {@link ClientRequest}.**
     *
     * The 3-digit HTTP response status code. E.G. `404`.
     * @since v0.1.1
     */
    open var statusCode: Number?

    /**
     * **Only valid for response obtained from {@link ClientRequest}.**
     *
     * The HTTP response status message (reason phrase). E.G. `OK` or `Internal Server Error`.
     * @since v0.11.10
     */
    open var statusMessage: String?

    /**
     * Calls `destroy()` on the socket that received the `IncomingMessage`. If `error`is provided, an `'error'` event is emitted on the socket and `error` is passed
     * as an argument to any listeners on the event.
     * @since v0.3.0
     */
    override fun destroy(error: Error) /* : this */
}
