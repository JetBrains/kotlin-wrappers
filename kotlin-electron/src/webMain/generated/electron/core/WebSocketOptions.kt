// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface WebSocketOptions {
// Docs: https://electronjs.org/docs/api/structures/web-socket-options
    /**
     * Extra HTTP headers to send with the opening handshake.
     */
    var headers: js.objects.ReadonlyRecord<String, String>?

    /**
     * Value of the `Origin` header to send with the opening handshake. Defaults to the
     * `http(s)` equivalent of the WebSocket URL's origin (e.g. connecting to
     * `wss://api.example.com` sends `Origin: https://api.example.com`), so that the
     * connection is treated as same-origin by the server and by SameSite cookie rules.
     */
    var origin: String?

    /**
     * The name of the `partition` the connection is associated with. Defaults to the
     * empty string, which corresponds to the default session. If `session` is
     * provided, `partition` is ignored.
     */
    var partition: String?

    /**
     * Requested WebSocket subprotocols.
     */
    var protocols: (Any /* (string) | (string[]) */)?

    /**
     * The `Session` the connection is associated with.
     */
    var session: Session?

    /**
     * Whether to send cookies from the session with the opening handshake and store
     * cookies received in the handshake response. Default is `false`.
     */
    var useSessionCookies: Boolean?
}
