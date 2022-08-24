// Automatically generated - do not modify!

package node.http

sealed external interface ServerOptions {
    var IncomingMessage: JsClass<IncomingMessage>?
    var ServerResponse: JsClass<ServerResponse>?

    /**
     * Optionally overrides the value of
     * `--max-http-header-size` for requests received by this server, i.e.
     * the maximum length of request headers in bytes.
     * @default 8192
     */
    var maxHeaderSize: Number?

    /**
     * Use an insecure HTTP parser that accepts invalid HTTP headers when true.
     * Using the insecure parser should be avoided.
     * See --insecure-http-parser for more information.
     * @default false
     */
    var insecureHTTPParser: Boolean?

    /**
     * If set to `true`, it disables the use of Nagle's algorithm immediately after a new incoming connection is received.
     * @default false
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
}
