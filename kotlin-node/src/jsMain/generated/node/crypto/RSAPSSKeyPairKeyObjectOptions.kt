// Automatically generated - do not modify!

package node.crypto

sealed external interface RSAPSSKeyPairKeyObjectOptions {
    /**
     * Key size in bits
     */
    var modulusLength: Number

    /**
     * Public exponent
     * @default 0x10001
     */
    var publicExponent: Number?

    /**
     * Name of the message digest
     */
    var hashAlgorithm: String?

    /**
     * Name of the message digest used by MGF1
     */
    var mgf1HashAlgorithm: String?

    /**
     * Minimal salt length in bytes
     */
    var saltLength: String?
}
