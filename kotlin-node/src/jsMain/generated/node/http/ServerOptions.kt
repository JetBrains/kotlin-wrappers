// Automatically generated - do not modify!

package node.http

import js.core.ReadonlyArray

sealed external interface ServerOptions<
        Request : IncomingMessage,
        Response : ServerResponse<*>,
        > {
    /**
     * Specifies the `IncomingMessage` class to be used. Useful for extending the original `IncomingMessage`.
     */
    var IncomingMessage: JsClass<Request>?

    /**
     * Specifies the `ServerResponse` class to be used. Useful for extending the original `ServerResponse`.
     */
    var ServerResponse: JsClass<Response>?

    /**
     * Sets the timeout value in milliseconds for receiving the entire request from the client.
     * @see Server.requestTimeout for more information.
     * @default 300000
     * @since v18.0.0
     */
    var requestTimeout: Number?

    /**
     * The number of milliseconds of inactivity a server needs to wait for additional incoming data,
     * after it has finished writing the last response, before a socket will be destroyed.
     * @see Server.keepAliveTimeout for more information.
     * @default 5000
     * @since v18.0.0
     */
    var keepAliveTimeout: Number?

    /**
     * Sets the interval value in milliseconds to check for request and headers timeout in incomplete requests.
     * @default 30000
     */
    var connectionsCheckingInterval: Number?

    /**
     * Use an insecure HTTP parser that accepts invalid HTTP headers when `true`.
     * Using the insecure parser should be avoided.
     * See --insecure-http-parser for more information.
     * @default false
     */
    var insecureHTTPParser: Boolean?

    /**
     * Optionally overrides the value of
     * `--max-http-header-size` for requests received by this server, i.e.
     * the maximum length of request headers in bytes.
     * @default 16384
     * @since v13.3.0
     */
    var maxHeaderSize: Number?

    /**
     * If set to `true`, it disables the use of Nagle's algorithm immediately after a new incoming connection is received.
     * @default true
     * @since v16.5.0
     */
    var noDelay: Boolean?

    /**
     * If set to `true`, it enables keep-alive functionality on the socket immediately after a new incoming connection is received,
     * similarly on what is done in `socket.setKeepAlive([enable][, initialDelay])`.
     * @default false
     * @since v16.5.0
     */
    var keepAlive: Boolean?

    /**
     * If set to a positive number, it sets the initial delay before the first keepalive probe is sent on an idle socket.
     * @default 0
     * @since v16.5.0
     */
    var keepAliveInitialDelay: Number?

    /**
     * A list of response headers that should be sent only once.
     * If the header's value is an array, the items will be joined using `; `.
     */
    var uniqueHeaders: ReadonlyArray<Any /* string | string[] */>?
}
