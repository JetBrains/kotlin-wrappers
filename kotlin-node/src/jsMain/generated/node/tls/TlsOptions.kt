package node.tls


sealed external interface TlsOptions : SecureContextOptions, CommonConnectionOptions, node.net.ServerOpts {
    /**
     * Abort the connection if the SSL/TLS handshake does not finish in the
     * specified number of milliseconds. A 'tlsClientError' is emitted on
     * the tls.Server object whenever a handshake times out. Default:
     * 120000 (120 seconds).
     */
    var handshakeTimeout: Double?

    /**
     * The number of seconds after which a TLS session created by the
     * server will no longer be resumable. See Session Resumption for more
     * information. Default: 300.
     */
    override var sessionTimeout: Double?

    /**
     * 48-bytes of cryptographically strong pseudo-random data.
     */
    override var ticketKeys: node.buffer.Buffer?

    /**
     *
     * @param socket
     * @param identity identity parameter sent from the client.
     * @return pre-shared key that must either be
     * a buffer or `null` to stop the negotiation process. Returned PSK must be
     * compatible with the selected cipher's digest.
     *
     * When negotiating TLS-PSK (pre-shared keys), this function is called
     * with the identity provided by the client.
     * If the return value is `null` the negotiation process will stop and an
     * "unknown_psk_identity" alert message will be sent to the other party.
     * If the server wishes to hide the fact that the PSK identity was not known,
     * the callback must provide some random data as `psk` to make the connection
     * fail with "decrypt_error" before negotiation is finished.
     * PSK ciphers are disabled by default, and using TLS-PSK thus
     * requires explicitly specifying a cipher suite with the `ciphers` option.
     * More information can be found in the RFC 4279.
     */
    fun pskCallback(socket: TLSSocket, identity: String): (Any /* DataView | NodeJS.TypedArray | null */)?

    /**
     * hint to send to a client to help
     * with selecting the identity during TLS-PSK negotiation. Will be ignored
     * in TLS 1.3. Upon failing to set pskIdentityHint `tlsClientError` will be
     * emitted with `ERR_TLS_PSK_SET_IDENTIY_HINT_FAILED` code.
     */
    var pskIdentityHint: String?
}
