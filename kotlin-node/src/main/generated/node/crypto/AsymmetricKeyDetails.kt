// Automatically generated - do not modify!

package node.crypto

import js.core.BigInt

sealed external interface AsymmetricKeyDetails {
    /**
     * Key size in bits (RSA, DSA).
     */
    var modulusLength: Number?

    /**
     * Public exponent (RSA).
     */
    var publicExponent: BigInt?

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
    var saltLength: Number?

    /**
     * Size of q in bits (DSA).
     */
    var divisorLength: Number?

    /**
     * Name of the curve (EC).
     */
    var namedCurve: String?
}
