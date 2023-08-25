// Automatically generated - do not modify!

package node.crypto

sealed external interface RSAPSSKeyPairOptions<PubF : KeyFormat, PrivF : KeyFormat> {
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
    var publicKeyEncoding: Any /* {
        type: 'spki';
        format: PubF;
    } */
    var privateKeyEncoding: BasePrivateKeyEncodingOptions<PrivF> /* {
        type: 'pkcs8';
    } */
}
