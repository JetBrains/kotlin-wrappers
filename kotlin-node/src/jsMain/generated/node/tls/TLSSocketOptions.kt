package node.tls


sealed external interface TLSSocketOptions : SecureContextOptions, CommonConnectionOptions {
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
    var session: node.buffer.Buffer?

    /**
     * If true, specifies that the OCSP status request extension will be
     * added to the client hello and an 'OCSPResponse' event will be
     * emitted on the socket before establishing a secure communication
     */
    var requestOCSP: Boolean?
}
