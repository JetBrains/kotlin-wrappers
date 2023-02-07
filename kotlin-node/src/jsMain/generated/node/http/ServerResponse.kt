// Automatically generated - do not modify!

@file:JsModule("node:http")

package node.http

import js.core.Record
import node.net.Socket

external class ServerResponse<Request : IncomingMessage> : OutgoingMessage<Request> {
    /**
     * When using implicit headers (not calling `response.writeHead()` explicitly),
     * this property controls the status code that will be sent to the client when
     * the headers get flushed.
     *
     * ```js
     * response.statusCode = 404;
     * ```
     *
     * After response header was sent to the client, this property indicates the
     * status code which was sent out.
     * @since v0.4.0
     */
    var statusCode: Number

    /**
     * When using implicit headers (not calling `response.writeHead()` explicitly),
     * this property controls the status message that will be sent to the client when
     * the headers get flushed. If this is left as `undefined` then the standard
     * message for the status code will be used.
     *
     * ```js
     * response.statusMessage = 'Not found';
     * ```
     *
     * After response header was sent to the client, this property indicates the
     * status message which was sent out.
     * @since v0.11.8
     */
    var statusMessage: String

    constructor(req: Request)

    fun assignSocket(socket: Socket)
    fun detachSocket(socket: Socket)

    /**
     * Sends an HTTP/1.1 100 Continue message to the client, indicating that
     * the request body should be sent. See the `'checkContinue'` event on`Server`.
     * @since v0.3.0
     */
    fun writeContinue(callback: () -> Unit = definedExternally)

    /**
     * Sends an HTTP/1.1 103 Early Hints message to the client with a Link header,
     * indicating that the user agent can preload/preconnect the linked resources.
     * The `hints` is an object containing the values of headers to be sent with
     * early hints message. The optional `callback` argument will be called when
     * the response message has been written.
     *
     * Example:
     *
     * ```js
     * const earlyHintsLink = '</styles.css>; rel=preload; as=style';
     * response.writeEarlyHints({
     *   'link': earlyHintsLink,
     * });
     *
     * const earlyHintsLinks = [
     *   '</styles.css>; rel=preload; as=style',
     *   '</scripts.js>; rel=preload; as=script',
     * ];
     * response.writeEarlyHints({
     *   'link': earlyHintsLinks,
     *   'x-trace-id': 'id for diagnostics'
     * });
     *
     * const earlyHintsCallback = () => console.log('early hints message sent');
     * response.writeEarlyHints({
     *   'link': earlyHintsLinks
     * }, earlyHintsCallback);
     * ```
     *
     * @since v18.11.0
     * @param hints An object containing the values of headers
     * @param callback Will be called when the response message has been written
     */
    fun writeEarlyHints(
        hints: Record<String, Any /* string | string[] */>,
        callback: () -> Unit = definedExternally,
    )

    /**
     * Sends a response header to the request. The status code is a 3-digit HTTP
     * status code, like `404`. The last argument, `headers`, are the response headers.
     * Optionally one can give a human-readable `statusMessage` as the second
     * argument.
     *
     * `headers` may be an `Array` where the keys and values are in the same list.
     * It is _not_ a list of tuples. So, the even-numbered offsets are key values,
     * and the odd-numbered offsets are the associated values. The array is in the same
     * format as `request.rawHeaders`.
     *
     * Returns a reference to the `ServerResponse`, so that calls can be chained.
     *
     * ```js
     * const body = 'hello world';
     * response
     *   .writeHead(200, {
     *     'Content-Length': Buffer.byteLength(body),
     *     'Content-Type': 'text/plain'
     *   })
     *   .end(body);
     * ```
     *
     * This method must only be called once on a message and it must
     * be called before `response.end()` is called.
     *
     * If `response.write()` or `response.end()` are called before calling
     * this, the implicit/mutable headers will be calculated and call this function.
     *
     * When headers have been set with `response.setHeader()`, they will be merged
     * with any headers passed to `response.writeHead()`, with the headers passed
     * to `response.writeHead()` given precedence.
     *
     * If this method is called and `response.setHeader()` has not been called,
     * it will directly write the supplied header values onto the network channel
     * without caching internally, and the `response.getHeader()` on the header
     * will not yield the expected result. If progressive population of headers is
     * desired with potential future retrieval and modification, use `response.setHeader()` instead.
     *
     * ```js
     * // Returns content-type = text/plain
     * const server = http.createServer((req, res) => {
     *   res.setHeader('Content-Type', 'text/html');
     *   res.setHeader('X-Foo', 'bar');
     *   res.writeHead(200, { 'Content-Type': 'text/plain' });
     *   res.end('ok');
     * });
     * ```
     *
     * `Content-Length` is given in bytes, not characters. Use `Buffer.byteLength()` to determine the length of the body in bytes. Node.js
     * does not check whether `Content-Length` and the length of the body which has
     * been transmitted are equal or not.
     *
     * Attempting to set a header field name or value that contains invalid characters
     * will result in a `TypeError` being thrown.
     * @since v0.1.30
     */
    fun writeHead(
        statusCode: Number,
        statusMessage: String = definedExternally,
        headers: Any /* OutgoingHttpHeaders | OutgoingHttpHeader[] */ = definedExternally,
    ) /* : this */

    fun writeHead(
        statusCode: Number,
        headers: Any /* OutgoingHttpHeaders | OutgoingHttpHeader[] */ = definedExternally,
    ) /* : this */

    /**
     * Sends an HTTP/1.1 102 Processing message to the client, indicating that
     * the request body should be sent.
     * @since v10.0.0
     */
    fun writeProcessing()
}
