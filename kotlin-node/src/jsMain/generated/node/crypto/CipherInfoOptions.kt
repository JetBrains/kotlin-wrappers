package node.crypto


sealed external interface CipherInfoOptions {
    /**
     * A test key length.
     */
    var keyLength: Double?

    /**
     * A test IV length.
     */
    var ivLength: Double?
}
