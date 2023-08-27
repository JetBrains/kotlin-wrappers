package node.tls


sealed external interface KeyObject {
    /**
     * Private keys in PEM format.
     */
    var pem: Any /* string | Buffer */

    /**
     * Optional passphrase.
     */
    var passphrase: String?
}
