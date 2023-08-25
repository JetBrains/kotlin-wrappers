// Automatically generated - do not modify!

package node.crypto

sealed external interface RSAKeyPairKeyObjectOptions {
    /**
     * Key size in bits
     */
    var modulusLength: Number

    /**
     * Public exponent
     * @default 0x10001
     */
    var publicExponent: Number?
}
