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
}
