// Automatically generated - do not modify!

package node.tls

@kotlinx.js.JsPlainObject
external interface TLSSocketOptions :
    SecureContextOptions,
    CommonConnectionOptions {
    /**
     * If true the TLS socket will be instantiated in server-mode.
     * Defaults to false.
     */
    var isServer: Boolean?

    /**
     * An optional net.Server instance.
     */
    var server: node.net.Server?

    /**
     * An optional Buffer instance containing a TLS session.
     */
    var session: node.buffer.Buffer<*>?
}
