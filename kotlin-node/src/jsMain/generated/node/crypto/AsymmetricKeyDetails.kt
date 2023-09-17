package node.crypto


sealed external interface AsymmetricKeyDetails {
    /**
     * Key size in bits (RSA, DSA).
     */
    var modulusLength: Double?

    /**
     * Public exponent (RSA).
     */
    var publicExponent: js.core.BigInt?

    /**
     * Name of the message digest (RSA-PSS).
     */
    var hashAlgorithm: String?

    /**
     * Name of the message digest used by MGF1 (RSA-PSS).
     */
    var mgf1HashAlgorithm: String?

    /**
     * Minimal salt length in bytes (RSA-PSS).
     */
    var saltLength: Double?

    /**
     * Size of q in bits (DSA).
     */
    var divisorLength: Double?

    /**
     * Name of the curve (EC).
     */
    var namedCurve: String?
}
