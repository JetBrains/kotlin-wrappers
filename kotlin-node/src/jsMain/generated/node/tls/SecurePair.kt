package node.tls


/**
 * @deprecated since v0.11.3 Use `tls.TLSSocket` instead.
 */

sealed external interface SecurePair {
    var encrypted: TLSSocket
    var cleartext: TLSSocket
}
